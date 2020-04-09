package com.extrato.lancamentos.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.extrato.lancamentos.domain.dto.ControleLancamentoDto;
import com.extrato.lancamentos.service.LancamentosService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/lancamentos")
public class LancamentosController {
    
    @Autowired
    private LancamentosService lancamentosService;
    
    @GetMapping
    @ApiOperation(value = "Retorna a lista de lançamentos")
    public ResponseEntity<List<ControleLancamentoDto>> buscarTodos() throws IOException {       
        return ResponseEntity.ok(lancamentosService.buscarTodos());
    }

}
