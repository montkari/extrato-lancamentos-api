package com.extrato.lancamentos.domain.dto;

import lombok.Data;

@Data
public class DadosDomicilioBancarioDto {
    
    private Integer codigoBanco;
    private Integer numeroAgencia;
    private String numeroContaCorrente;

}
