package com.portfolio.controle_financeiro.service;

import com.portfolio.controle_financeiro.entity.Categoria;
import com.portfolio.controle_financeiro.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    // CREATE
    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // READ ALL
    public List<Categoria> listarTodas() {
        return categoriaRepository.findAll();
    }

    // READ BY ID
    public Categoria buscarPorId(Long id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
    }

    // DELETE
    public void deletar(Long id) {
        categoriaRepository.deleteById(id);
    }
}