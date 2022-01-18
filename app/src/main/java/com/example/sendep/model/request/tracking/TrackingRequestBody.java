package com.example.sendep.model.request.tracking;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "soapenv:Body", strict = false)
public class TrackingRequestBody {
    @Element(name = "res:buscaEventos", required = false)
    private TrackingRequestData trackingRequestData;

    public TrackingRequestData getTrackingRequestData() {
        return trackingRequestData;
    }

    public void setTrackingRequestData(TrackingRequestData trackingRequestData) {
        this.trackingRequestData = trackingRequestData;
    }
}
