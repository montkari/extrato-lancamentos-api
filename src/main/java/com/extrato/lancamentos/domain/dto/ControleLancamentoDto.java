package com.extrato.lancamentos.domain.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class ControleLancamentoDto {
    
    private LancamentoContaCorrenteDto lancamentoContaCorrente;   
    private LocalDate dataEfetivaLancamento;   
    private LocalDate dataLancamentoContaCorrenteCliente;   
    private Long numeroEvento;    
    private String nomeBanco;   
    private BigDecimal valorLancamentoRemessa;   
    private String codigoIdentificadorUnico;
}
