package com.portfolio.controle_financeiro.relatorio;

import com.portfolio.controle_financeiro.dto.GastoCategoriaDTO;
import com.portfolio.controle_financeiro.dto.ResumoMensalDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/relatorios")
public class RelatorioController {

    private final RelatorioService relatorioService;

    public RelatorioController(RelatorioService relatorioService) {
        this.relatorioService = relatorioService;
    }

    // resumo mensal
    @GetMapping("/resumo")
    public ResumoMensalDTO resumo(
            @RequestParam LocalDate inicio,
            @RequestParam LocalDate fim
    ) {
        return relatorioService.resumoMensal(inicio, fim);
    }

    // gastos por categoria
    @GetMapping("/categorias")
    public List<GastoCategoriaDTO> categorias(
            @RequestParam LocalDate inicio,
            @RequestParam LocalDate fim
    ) {
        return relatorioService.gastosPorCategoria(inicio, fim);
    }
}