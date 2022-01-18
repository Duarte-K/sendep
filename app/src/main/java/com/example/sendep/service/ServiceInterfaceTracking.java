package com.example.sendep.service;

import com.example.sendep.model.request.tracking.TrackingRequestEnvelope;
import com.example.sendep.model.response.tracking.TrackingResponseEnvelope;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ServiceInterfaceTracking {
    @Headers({
            "Content-Type: text/xml",
            "Accept-Charset: utf-8"
    })

    @POST("rastro")
    Call<TrackingResponseEnvelope> tracking(@Body TrackingRequestEnvelope body);
}
