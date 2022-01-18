package com.example.sendep.model.response.consult;

import com.example.sendep.model.response.consult.ConsultCodeResponseBody;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

@Root(name = "soap:Envelope")
@NamespaceList({
        @Namespace( prefix = "soap", reference = "http://schemas.xmlsoap.org/soap/envelope/"),
})

public class ConsultCodeResponseEnvelope {
    @Element(name = "soap:Body", required = false)
    private ConsultCodeResponseBody body;

    public ConsultCodeResponseBody getBody() {
        return body;
    }

    public void setBody(ConsultCodeResponseBody body) {
        this.body = body;
    }
}
