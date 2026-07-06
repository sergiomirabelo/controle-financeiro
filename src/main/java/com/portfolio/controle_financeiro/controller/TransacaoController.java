package com.portfolio.controle_financeiro.controller;

import com.portfolio.controle_financeiro.dto.TransacaoResponseDTO;
import com.portfolio.controle_financeiro.entity.Transacao;
import com.portfolio.controle_financeiro.service.TransacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    private final TransacaoService service;

    public TransacaoController(TransacaoService service) {
        this.service = service;
    }

    @PostMapping
    public TransacaoResponseDTO salvar(@RequestBody Transacao t) {
        return service.salvar(t);
    }

    @GetMapping
    public List<TransacaoResponseDTO> listar() {
        return service.listar();
    }
}