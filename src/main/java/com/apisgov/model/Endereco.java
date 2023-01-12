package com.apisgov.model;

public class Endereco {

    private Integer cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private Integer ibge;
    private Integer gia;
    private Integer ddd;
    private Integer siafi;

    public Integer getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public Integer getGia() {
        return gia;
    }

    public Integer getDdd() {
        return ddd;
    }

    public Integer getSiafi() {
        return siafi;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep=" + cep +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", ibge=" + ibge +
                ", gia=" + gia +
                ", ddd=" + ddd +
                ", siafi=" + siafi +
                '}';
    }

    public static class EnderecoBuilder {
        Endereco end = new Endereco();

        public EnderecoBuilder withCep(Integer cep) {
            end.cep = cep;
            return this;
        }

        public EnderecoBuilder withLogradouro(String logradouro) {
            end.logradouro = logradouro;
            return this;
        }

        public EnderecoBuilder withComplemento(String complemento) {
            end.complemento = complemento;
            return this;
        }

        public EnderecoBuilder withBairro(String bairro) {
            end.bairro = bairro;
            return this;
        }

        public EnderecoBuilder withLocalidade(String localidade) {
            end.localidade = localidade;
            return this;
        }

        public EnderecoBuilder withUf(String uf) {
            end.uf = uf;
            return this;
        }

        public EnderecoBuilder withIbge(Integer ibge) {
            end.ibge = ibge;
            return this;
        }

        public EnderecoBuilder withGia(Integer gia) {
            end.gia = gia;
            return this;
        }

        public EnderecoBuilder withDdd(Integer ddd) {
            end.ddd = ddd;
            return this;
        }

        public EnderecoBuilder withSiafi(Integer siafi) {
            end.siafi = siafi;
            return this;
        }

        public Endereco build() {
            return end;
        }
    }
}
