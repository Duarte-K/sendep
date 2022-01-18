package com.example.sendep.model.response.consult;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "consultaCEPResponse", strict = false)
@Namespace(reference = "http://cliente.bean.master.sigep.bsb.correios.com.br/", prefix = "ns2")

public class ConsultCodeResponseData {
    @Element(name = "return", required = false)
    private ConsultCodeResponseReturn consultCodeResponseReturn;

    public ConsultCodeResponseReturn getConsultCodeResponseReturn() {
        return consultCodeResponseReturn;
    }

    public void setConsultCodeResponseReturn(ConsultCodeResponseReturn consultCodeResponseReturn) {
        this.consultCodeResponseReturn = consultCodeResponseReturn;
    }

}
