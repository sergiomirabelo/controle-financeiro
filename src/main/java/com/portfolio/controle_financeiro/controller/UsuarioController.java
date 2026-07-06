package com.portfolio.controle_financeiro.controller;

import com.portfolio.controle_financeiro.dto.UsuarioDTO;
import com.portfolio.controle_financeiro.entity.Usuario;
import com.portfolio.controle_financeiro.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // CREATE
    @PostMapping
    public Usuario criar(@RequestBody UsuarioDTO dto) {

        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());

        return usuarioService.salvar(usuario);
    }

    // READ ALL
    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listarTodos();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Usuario buscar(@PathVariable Long id) {
        return usuarioService.buscarPorId(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        usuarioService.deletar(id);
    }
}