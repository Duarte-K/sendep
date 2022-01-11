package com.example.sendep.model.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "soap:Body", strict = false)

public class ConsultCodeResponseBody {
    @Element(name = "consultaCEPResponse",required = false)
    private ConsultCodeResponseData consultCodeResponseData;

    public ConsultCodeResponseData getConsultCodeResponseData() {
        return consultCodeResponseData;
    }

    public void setConsultCodeResponseData(ConsultCodeResponseData consultCodeResponseData) {
        this.consultCodeResponseData = consultCodeResponseData;
    }
}
