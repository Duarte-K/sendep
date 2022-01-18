package com.example.sendep.model.request.consult;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "cli:consultaCEP", strict = false)

public class ConsultCodeRequestData {
    @Element(name = "cep", required = false)
    private String cep;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
