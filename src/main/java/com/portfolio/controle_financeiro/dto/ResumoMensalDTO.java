package com.portfolio.controle_financeiro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ResumoMensalDTO {

    private BigDecimal receitas;
    private BigDecimal despesas;
    private BigDecimal saldo;
}