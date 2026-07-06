package com.portfolio.controle_financeiro.repository;

import com.portfolio.controle_financeiro.entity.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

    // filtro por período
    List<Transacao> findByDataBetween(LocalDate inicio, LocalDate fim);

    // gastos por categoria (DESPESAS)
    @Query("""
        SELECT t.categoria.nome, SUM(t.valor)
        FROM Transacao t
        WHERE t.data BETWEEN :inicio AND :fim
        AND t.tipo = 'DESPESA'
        GROUP BY t.categoria.nome
    """)
    List<Object[]> gastosPorCategoria(LocalDate inicio, LocalDate fim);
}