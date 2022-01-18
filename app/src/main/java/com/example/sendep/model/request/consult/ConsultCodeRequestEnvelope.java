package com.example.sendep.model.request.consult;

import com.example.sendep.model.request.consult.ConsultCodeRequestBody;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

@Root(name = "soapenv:Envelope")
@NamespaceList({
        @Namespace( prefix = "soapenv", reference = "http://schemas.xmlsoap.org/soap/envelope/"),
        @Namespace( prefix = "cli", reference = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
})

public class ConsultCodeRequestEnvelope {
    @Element(name = "soapenv:Body", required = false)
    private ConsultCodeRequestBody body;

    public ConsultCodeRequestBody getBody() {
        return body;
    }

    public void setBody(ConsultCodeRequestBody body) {
        this.body = body;
    }
}
