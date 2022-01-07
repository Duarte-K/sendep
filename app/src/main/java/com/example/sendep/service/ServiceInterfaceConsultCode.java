package com.example.sendep.service;

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

    @POST("")
    Call<ConsultCodeResponseEnvelope> consultCode(@Body ConsultCodeResponseEnvelope body);
}
