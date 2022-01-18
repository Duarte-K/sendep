package com.example.sendep.model.response.consult;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "return", strict = false)
public class ConsultCodeResponseReturn {
    @Element(name = "bairro", required = false)
    private String bairro;
    @Element(name = "cep", required = false)
    private String cep;
    @Element(name = "cidade", required = false)
    private String cidade;
    @Element(name = "complemento2", required = false)
    private String complemento2;
    @Element(name = "end", required = false)
    private String end;
    @Element(name = "uf", required = false)
    private String uf;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEnd() {
        return end;
    }

    public String getComplemento2() {
        return complemento2;
    }

    public void setComplemento2(String complemento2) {
        this.complemento2 = complemento2;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
