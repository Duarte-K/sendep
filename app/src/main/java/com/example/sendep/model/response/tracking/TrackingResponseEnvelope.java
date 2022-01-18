package com.example.sendep.model.response.tracking;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "soapenv:Envelope", strict = false)
@Namespace(prefix = "soapenv", reference = "http://schemas.xmlsoap.org/soap/envelope/")

public class TrackingResponseEnvelope {
    @Element(name = "soapenv:Body", required = false)
    private TrackingResponseBody body;

    public TrackingResponseBody getBody() {
        return body;
    }

    public void setBody(TrackingResponseBody body) {
        this.body = body;
    }
}
