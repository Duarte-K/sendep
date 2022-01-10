package com.example.sendep.model.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "soapenv:Body", strict = false)

public class ConsultCodeRequestBody {
    @Element(name = "cli:consultaCEP",required = false)
    private ConsultCodeRequestData consultCodeRequestData;

    public ConsultCodeRequestData getConsultCodeRequestData() {
        return consultCodeRequestData;
    }

    public void setConsultCodeRequestData(ConsultCodeRequestData consultCodeRequestData) {
        this.consultCodeRequestData = consultCodeRequestData;
    }
}
