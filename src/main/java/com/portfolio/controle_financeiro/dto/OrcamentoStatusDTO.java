package com.portfolio.controle_financeiro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class OrcamentoStatusDTO {

    private BigDecimal limite;
    private BigDecimal gasto;
    private BigDecimal percentual;
}