package com.example.sendep.service;

import com.example.sendep.model.request.ConsultCodeRequestEnvelope;
import com.example.sendep.model.response.ConsultCodeResponseEnvelope;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ServiceInterfaceConsultCode {
    @Headers({
            "Content-Type: text/xml",
            "Accept-Charset: utf-8"
    })

    @POST("AtendeCliente")
    Call<ConsultCodeResponseEnvelope> consultCode(@Body ConsultCodeRequestEnvelope body);
}
