package com.extrato.lancamentos.domain;

import javax.persistence.Embeddable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Embeddable
public class DadosDomicilioBancario {
    
    private Integer codigoBanco;
    private Integer numeroAgencia;
    private String numeroContaCorrente;

}
