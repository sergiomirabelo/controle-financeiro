package com.portfolio.controle_financeiro.repository;

import com.portfolio.controle_financeiro.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}