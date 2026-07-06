package com.portfolio.controle_financeiro.repository;

import com.portfolio.controle_financeiro.entity.Orcamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrcamentoRepository extends JpaRepository<Orcamento, Long> {

    Optional<Orcamento> findByUsuarioIdAndMesReferencia(Long usuarioId, String mesReferencia);
}