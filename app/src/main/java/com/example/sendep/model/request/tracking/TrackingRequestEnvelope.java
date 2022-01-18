package com.example.sendep.model.request.tracking;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

@Root(name = "soapenv:Envelope")
@NamespaceList({
        @Namespace( prefix = "soapenv", reference = "http://schemas.xmlsoap.org/soap/envelope/"),
        @Namespace( prefix = "res", reference = "http://resource.webservice.correios.com.br/")
})
public class TrackingRequestEnvelope {
    @Element(name = "soapenv:Body", required = false)
    private TrackingRequestBody body;


    public TrackingRequestBody getBody() {
        return body;
    }

    public void setBody(TrackingRequestBody body) {
        this.body = body;
    }
}
