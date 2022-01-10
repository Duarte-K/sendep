package com.example.sendep.model.request;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "cli:consultaCEP", strict = false)
@Namespace(reference = "https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/")

public class ConsultCodeRequestData {
    private String cep;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
