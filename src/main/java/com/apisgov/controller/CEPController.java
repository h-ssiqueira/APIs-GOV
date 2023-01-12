package com.apisgov.controller;

import com.apisgov.model.Endereco;
import com.apisgov.service.CEPService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/cep")
@Slf4j
public class CEPController {

    private CEPService service;

    public CEPController(CEPService service) {
        this.service = service;
    }

    @GetMapping("{CEP}")
    public Endereco getCep(@PathVariable("CEP") String CEP) {
        return service.consultaCEP(CEP);
    }
}
