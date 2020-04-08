package com.extrato.lancamentos.domain.dto;

import lombok.Data;

@Data
public class LancamentoContaCorrenteDto {
    
    private Long numeroRemessaBanco;
    private String nomeTipoOperacao;
    private String nomeSituacaoRemessa;
    DadosDomicilioBancarioDto dadosDomicilioBancario;

}
