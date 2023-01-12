package com.apisgov.interfaces;

import com.apisgov.model.Endereco;

public interface CEP {
    public abstract Endereco consultaCEP(String cep);
}
