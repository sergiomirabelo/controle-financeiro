package com.portfolio.controle_financeiro.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TransacaoResponseDTO {

    public Long id;
    public String descricao;
    public BigDecimal valor;
    public LocalDate data;
    public String tipo;
    public boolean recorrente;

    public Long usuarioId;
    public String usuarioEmail;

    public Long categoriaId;
    public String categoriaNome;
}