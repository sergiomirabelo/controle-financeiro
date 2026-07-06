package com.portfolio.controle_financeiro.service;

import com.portfolio.controle_financeiro.entity.Usuario;
import com.portfolio.controle_financeiro.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository usuarioRepository,
                          PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // CREATE (salvar usuário com senha criptografada)
    public Usuario salvar(Usuario usuario) {

        // evita salvar senha vazia ou já criptografada sem querer
        if (usuario.getSenha() != null) {
            usuario.setSenha(
                    passwordEncoder.encode(usuario.getSenha())
            );
        }

        return usuarioRepository.save(usuario);
    }

    // READ ALL
    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    // READ BY ID
    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    // DELETE
    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }
}