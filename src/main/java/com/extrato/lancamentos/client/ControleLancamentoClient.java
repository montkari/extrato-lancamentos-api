package com.extrato.lancamentos.client;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.extrato.lancamentos.domain.dto.LancamentoContaLegadoDto;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

@Component
public class ControleLancamentoClient {
    
    public LancamentoContaLegadoDto leituraJsonLegado() throws IOException {
        DateTimeFormatter formaterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        JavaTimeModule javaTimeModule = new JavaTimeModule();
        javaTimeModule.addSerializer(LocalDate.class, new LocalDateSerializer(formaterDate));
        javaTimeModule.addDeserializer(LocalDate.class, new LocalDateDeserializer(formaterDate));
        
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(javaTimeModule);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Resource resource = new ClassPathResource("lancamento-conta-legado.json");
        LancamentoContaLegadoDto lancamentoContaLegado = objectMapper
                .readValue(resource.getFile(), LancamentoContaLegadoDto.class);
        return lancamentoContaLegado;
    }

}
