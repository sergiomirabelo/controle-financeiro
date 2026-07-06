package com.portfolio.controle_financeiro.service;

import com.portfolio.controle_financeiro.dto.TransacaoResponseDTO;
import com.portfolio.controle_financeiro.entity.Transacao;
import com.portfolio.controle_financeiro.repository.TransacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoService {

    private final TransacaoRepository repository;

    public TransacaoService(TransacaoRepository repository) {
        this.repository = repository;
    }

    public TransacaoResponseDTO salvar(Transacao t) {
        return toDTO(repository.save(t));
    }

    public List<TransacaoResponseDTO> listar() {
        return repository.findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }

    private TransacaoResponseDTO toDTO(Transacao t) {

        TransacaoResponseDTO dto = new TransacaoResponseDTO();

        dto.id = t.getId();
        dto.descricao = t.getDescricao();
        dto.valor = t.getValor();
        dto.data = t.getData();
        dto.tipo = t.getTipo().name();
        dto.recorrente = t.getRecorrente();

        if (t.getUsuario() != null) {
            dto.usuarioId = t.getUsuario().getId();
            dto.usuarioEmail = t.getUsuario().getEmail();
        }

        if (t.getCategoria() != null) {
            dto.categoriaId = t.getCategoria().getId();
            dto.categoriaNome = t.getCategoria().getNome();
        }

        return dto;
    }
}