package com.apisgov.service;

import com.apisgov.model.Endereco;
import com.apisgov.interfaces.CEP;
import com.apisgov.utils.validator.CEPvalidator;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;

@Service
public class CEPService implements CEP {
    private final Logger LOG = Logger.getLogger(this.getClass().getName());

    private static final Duration REQUEST_TIMEOUT = Duration.ofSeconds(3);

    private final WebClient localApiClient;

    private CEPvalidator validator;

    public CEPService(CEPvalidator validator) {
        this.localApiClient = WebClient.create("http://viacep.com.br/ws/");
        this.validator = validator;
    }

    public Endereco consultaCEP(String cep) {
        try {
            //validator.validate(cep);

            Endereco response = localApiClient
                                    .get()
                                    .uri(cep + "/json/")
                                    .retrieve()
                                    .bodyToMono(Endereco.class)
                                    .block(REQUEST_TIMEOUT);
            assert response != null;
            System.out.println(response);
        } catch (Exception e){
            LOG.error("Falha ao encontrar CEP", e);
        }
        return null;
    }
}
