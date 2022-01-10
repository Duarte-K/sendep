package com.example.sendep.model.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

@Root(name = "soapenv:Envelope")
@NamespaceList({
        @Namespace( prefix = "xsi", reference = "http://www.w3.org/2001/XMLSchema-instance"),
        @Namespace( prefix = "xsd", reference = "http://www.w3.org/2001/XMLSchema"),
        @Namespace( prefix = "soap12", reference = "http://www.w3.org/2003/05/soap-envelope")
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
