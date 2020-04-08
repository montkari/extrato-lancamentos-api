package com.extrato.lancamentos.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Embeddable
public class LancamentoContaCorrente {
    
    private Long numeroRemessaBanco;
    
    private String nomeSituacaoRemessa;
    
    @Embedded
    DadosDomicilioBancario dadosDomicilioBancario;
    
    private String nomeTipoOperacao;

}
