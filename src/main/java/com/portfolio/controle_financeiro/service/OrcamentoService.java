package com.portfolio.controle_financeiro.service;

import com.portfolio.controle_financeiro.dto.OrcamentoRequestDTO;
import com.portfolio.controle_financeiro.dto.OrcamentoResponseDTO;
import com.portfolio.controle_financeiro.entity.Orcamento;
import com.portfolio.controle_financeiro.entity.Usuario;
import com.portfolio.controle_financeiro.repository.OrcamentoRepository;
import com.portfolio.controle_financeiro.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class OrcamentoService {

    private final OrcamentoRepository orcamentoRepository;
    private final UsuarioRepository usuarioRepository;

    public OrcamentoService(OrcamentoRepository orcamentoRepository,
                            UsuarioRepository usuarioRepository) {
        this.orcamentoRepository = orcamentoRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public OrcamentoResponseDTO salvar(OrcamentoRequestDTO dto) {

        Usuario usuario = usuarioRepository.findById(dto.usuarioId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        // impede duplicar orçamento do mesmo mês
        orcamentoRepository.findByUsuarioIdAndMesReferencia(dto.usuarioId, dto.mesReferencia)
                .ifPresent(o -> {
                    throw new RuntimeException("Já existe orçamento para esse mês");
                });

        Orcamento o = new Orcamento();
        o.setLimiteMensal(dto.limiteMensal);
        o.setMesReferencia(dto.mesReferencia);
        o.setUsuario(usuario);

        return toDTO(orcamentoRepository.save(o));
    }

    public OrcamentoResponseDTO buscarPorUsuarioEMes(Long usuarioId, String mesReferencia) {

        Orcamento o = orcamentoRepository
                .findByUsuarioIdAndMesReferencia(usuarioId, mesReferencia)
                .orElseThrow(() -> new RuntimeException("Orçamento não encontrado"));

        return toDTO(o);
    }

    private OrcamentoResponseDTO toDTO(Orcamento o) {

        OrcamentoResponseDTO dto = new OrcamentoResponseDTO();

        dto.id = o.getId();
        dto.limiteMensal = o.getLimiteMensal();
        dto.mesReferencia = o.getMesReferencia();

        dto.usuarioId = o.getUsuario().getId();
        dto.usuarioNome = o.getUsuario().getNome();
        dto.usuarioEmail = o.getUsuario().getEmail();

        return dto;
    }
}