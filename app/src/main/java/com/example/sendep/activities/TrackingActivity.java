package com.example.sendep.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.sendep.R;
import com.example.sendep.model.request.consult.ConsultCodeRequestBody;
import com.example.sendep.model.request.consult.ConsultCodeRequestData;
import com.example.sendep.model.request.consult.ConsultCodeRequestEnvelope;
import com.example.sendep.model.request.tracking.TrackingRequestBody;
import com.example.sendep.model.request.tracking.TrackingRequestData;
import com.example.sendep.model.request.tracking.TrackingRequestEnvelope;
import com.example.sendep.model.response.consult.ConsultCodeResponseEnvelope;
import com.example.sendep.model.response.tracking.TrackingResponseEnvelope;
import com.example.sendep.service.ServiceGenerator;
import com.example.sendep.service.ServiceInterfaceConsultCode;
import com.example.sendep.service.ServiceInterfaceTracking;
import com.example.sendep.service.ServiceTrackingGenerator;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

public class TrackingActivity extends AppCompatActivity {
    private ImageButton btnBack;
    private EditText trackCode;
    private Button btnTrack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking);

        btnBack = findViewById(R.id.btn_backTracking);
        btnTrack = findViewById(R.id.btn_track);
        trackCode = findViewById(R.id.et_tracking);

        btnTrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isNetworkConnected()){
                   // retrofitTracking(trackcode.getText().toString());
                }else{
                    Toast.makeText(getApplicationContext(), "Sem conexão à internet", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void retrofitTracking(String code){

        /*TrackingRequestEnvelope envelope = new TrackingRequestEnvelope();
        TrackingRequestData data = new TrackingRequestData();
        TrackingRequestBody body = new TrackingRequestBody();

        TrackingResponseEnvelope envelope = new TrackingResponseEnvelope();
        TrackingResponseReturn ret = new TrackingResponseReturn();
        TrackingResponseData data = new TrackingResponseData();
        TrackingResponseBody body = new TrackingResponseBody();
        ret.setCep("60337-380");
        ret.setComplemento2("haha");
        ret.setBairro("Jurema");
        ret.setCidade("Fortaleza");
        ret.setUf("CE");
        ret.setEnd("Rua blabla");
        data.setTrackingResponseReturn(ret);
        body.setTrackingResponseData(data);
        envelope.setBody(body);

        ServiceInterfaceTracking service = ServiceTrackingGenerator.createService(ServiceInterfaceTracking.class);
        Call<TrackingResponseEnvelope> call = service.tracking(envelope);

        call.enqueue(new retrofit2.Callback<TrackingResponseEnvelope>() {
            @Override
            public void onResponse(Call<TrackingResponseEnvelope> call, Response<TrackingResponseEnvelope> response) {
                //Verifica se de sucesso na chamada.
                if (response.isSuccessful()) {

                    TrackingResponseEnvelope envelopeResponse = response.body();

                    //verifica aqui se o corpo da resposta não é nulo
                    if (envelopeResponse.getBody() != null) {
                        Toast.makeText(getApplicationContext(), "fafa"+envelopeResponse.getBody().getConsultCodeResponseData().getConsultCodeResponseReturn().getCep(), Toast.LENGTH_SHORT).show();
                    } else {
                        //resposta nula
                        Toast.makeText(getApplicationContext(),"Erro: resposta nula",Toast.LENGTH_LONG).show();
                    }

                } else {
                    // segura os erros de requisição
                    ResponseBody errorBody = response.errorBody();
                    Log.e("Erroaa: ", " "+errorBody);
                    Toast.makeText(getApplicationContext(),"Erro na chamada do servidor",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<TrackingResponseEnvelope> call, Throwable t) {

            }
        });*/
    }

    //Método para verificar se tem acesso a internet
    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }
}