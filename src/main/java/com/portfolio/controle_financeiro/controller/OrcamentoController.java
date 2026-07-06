package com.portfolio.controle_financeiro.controller;

import com.portfolio.controle_financeiro.dto.OrcamentoRequestDTO;
import com.portfolio.controle_financeiro.dto.OrcamentoResponseDTO;
import com.portfolio.controle_financeiro.service.OrcamentoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orcamentos")
public class OrcamentoController {

    private final OrcamentoService service;

    public OrcamentoController(OrcamentoService service) {
        this.service = service;
    }

    @PostMapping
    public OrcamentoResponseDTO salvar(@RequestBody OrcamentoRequestDTO dto) {
        return service.salvar(dto);
    }

    @GetMapping("/{usuarioId}/{mesReferencia}")
    public OrcamentoResponseDTO buscar(
            @PathVariable Long usuarioId,
            @PathVariable String mesReferencia
    ) {
        return service.buscarPorUsuarioEMes(usuarioId, mesReferencia);
    }
}