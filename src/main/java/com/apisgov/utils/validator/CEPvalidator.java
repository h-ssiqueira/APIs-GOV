package com.apisgov.utils.validator;

import org.springframework.stereotype.Component;

@Component
public class CEPvalidator {

    private final String cep;

    public CEPvalidator(String cep) {
        this.cep = cep;
    }

//    if (cep.matches("^[0-9]{8}$")){
//
//    } else {
//        throw new Exception("Fora do padrão");
//    }
}
