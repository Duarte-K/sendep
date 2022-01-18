package com.example.sendep.model.response.tracking;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "buscaEventosResponse", strict = false)
@Namespace(prefix = "ns2", reference = "http://resource.webservice.correios.com.br/")
public class TrackingResponseData {
    @Element(name = "return", required = false)
    private TrackingResponseReturn  trackingResponseReturn;

    public TrackingResponseReturn getTrackingResponseReturn() {
        return trackingResponseReturn;
    }

    public void setTrackingResponseReturn(TrackingResponseReturn trackingResponseReturn) {
        this.trackingResponseReturn = trackingResponseReturn;
    }
}
