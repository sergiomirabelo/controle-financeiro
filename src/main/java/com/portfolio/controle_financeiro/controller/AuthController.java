package com.portfolio.controle_financeiro.controller;

import com.portfolio.controle_financeiro.dto.LoginDTO;
import com.portfolio.controle_financeiro.entity.Usuario;
import com.portfolio.controle_financeiro.repository.UsuarioRepository;
import com.portfolio.controle_financeiro.security.JwtService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public AuthController(UsuarioRepository usuarioRepository,
                          PasswordEncoder passwordEncoder,
                          JwtService jwtService) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginDTO dto) {

        // 1. busca usuário pelo email
        Usuario usuario = usuarioRepository.findByEmail(dto.getEmail())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        // 2. valida senha (BCrypt)
        boolean senhaOk = passwordEncoder.matches(dto.getSenha(), usuario.getSenha());

        if (!senhaOk) {
            throw new RuntimeException("Senha inválida");
        }

        // 3. gera token JWT
        return jwtService.gerarToken(usuario.getEmail());
    }
}