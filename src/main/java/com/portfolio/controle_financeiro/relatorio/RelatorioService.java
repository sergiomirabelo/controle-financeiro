package com.portfolio.controle_financeiro.relatorio;

import com.portfolio.controle_financeiro.dto.GastoCategoriaDTO;
import com.portfolio.controle_financeiro.dto.ResumoMensalDTO;
import com.portfolio.controle_financeiro.entity.TipoTransacao;
import com.portfolio.controle_financeiro.entity.Transacao;
import com.portfolio.controle_financeiro.repository.TransacaoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class RelatorioService {

    private final TransacaoRepository repository;

    public RelatorioService(TransacaoRepository repository) {
        this.repository = repository;
    }

    // resumo mensal
    public ResumoMensalDTO resumoMensal(LocalDate inicio, LocalDate fim){

        List<Transacao> transacoes = repository.findByDataBetween(inicio, fim);

        BigDecimal receitas = BigDecimal.ZERO;
        BigDecimal despesas = BigDecimal.ZERO;

        for(Transacao t : transacoes){

            if(t.getTipo() == TipoTransacao.RECEITA){
                receitas = receitas.add(t.getValor());
            } else {
                despesas = despesas.add(t.getValor());
            }
        }

        BigDecimal saldo = receitas.subtract(despesas);

        return new ResumoMensalDTO(receitas, despesas, saldo);
    }

    // gastos por categoria
    public List<GastoCategoriaDTO> gastosPorCategoria(LocalDate inicio, LocalDate fim){

        List<Object[]> dados = repository.gastosPorCategoria(inicio, fim);

        return dados.stream()
                .map(obj -> new GastoCategoriaDTO(
                        (String) obj[0],
                        (BigDecimal) obj[1]
                ))
                .toList();
    }
}