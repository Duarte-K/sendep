package com.example.sendep.model.response;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

public class ConsultCodeResponseData {

    @Root(name = "ns2:consultaCEPResponse", strict = false)
    @Namespace(reference = "ns2=\"http://cliente.bean.master.sigep.bsb.correios.com.br/")

    private String bairro, cep, cidade, end, uf;

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
