package com.extrato.lancamentos.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_CONTROLE_LANCAMENTO")
public class ControleLancamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONTROLE_LANCAMENTO")
    @SequenceGenerator(name = "SEQ_CONTROLE_LANCAMENTO", sequenceName = "SEQ_CONTROLE_LANCAMENTO", allocationSize = 1)
    private Long codigoIdentificadorUnico;
    
    @Embedded
    private LancamentoContaCorrente lancamentoContaCorrente;
    
    private LocalDate dataEfetivaLancamento;
    
    private LocalDate dataLancamentoContaCorrenteCliente;
    
    private Long numeroEvento;
    
    private String descricaoGrupoPagamento;
    
    private String nomeBanco;
    
    private Integer quantidadeLancamentoRemessa;
    
    private String numeroRaizCNPJ;
    
    private String numeroSufixoCNPJ;
    
    private BigDecimal valorLancamentoRemessa;

}
