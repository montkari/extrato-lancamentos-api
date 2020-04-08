package com.extrato.lancamentos.domain.dto;

import java.util.List;

import lombok.Data;

@Data
public class LancamentoContaLegadoDto {
    
    List<ControleLancamentoDto> listaControleLancamento;

}
