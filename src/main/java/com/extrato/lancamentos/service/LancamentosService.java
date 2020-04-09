package com.extrato.lancamentos.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extrato.lancamentos.client.ControleLancamentoClient;
import com.extrato.lancamentos.domain.dto.ControleLancamentoDto;
import com.extrato.lancamentos.domain.dto.LancamentoContaLegadoDto;

@Service
public class LancamentosService {
    
    @Autowired
    private ControleLancamentoClient controleLegado;
    
    public List<ControleLancamentoDto> buscarTodos() throws IOException {
        LancamentoContaLegadoDto legadoDto = controleLegado.leituraJsonLegado();
        return legadoDto.getListaControleLancamento();
    }

}
