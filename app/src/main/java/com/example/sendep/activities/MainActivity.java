package com.example.sendep.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sendep.R;
import com.example.sendep.model.response.ConsultCodeResponseEnvelope;
import com.example.sendep.service.ServiceGenerator;
import com.example.sendep.service.ServiceInterfaceConsultCode;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ImageView back;
    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void retrofitConsultCep(){

        ServiceInterfaceConsultCode service = ServiceGenerator.createService(ServiceInterfaceConsultCode.class);
        /*Call<ConsultCodeResponseEnvelope> call = service.consultCode();

        call.enqueue(new retrofit2.Callback<ConsultCodeResponseEnvelope>() {
            @Override
            public void onResponse(Call<ConsultCodeResponseEnvelope> call, Response<ConsultCodeResponseEnvelope> response) {
                //Verifica se de sucesso na chamada.
                if (response.isSuccessful()) {

                    ConsultCodeResponseEnvelope envelopeResponse = response.body();

                    //verifica aqui se o corpo da resposta não é nulo
                    if (envelopeResponse != null) {

                    } else {
                        //resposta nula
                        Toast.makeText(getApplicationContext(),"Erro: resposta nula",Toast.LENGTH_LONG).show();
                    }

                } else {

                    // segura os erros de requisição
                    ResponseBody errorBody = response.errorBody();
                    Log.e("Erro: ", " "+errorBody);



                }
            }

            @Override
            public void onFailure(Call<ConsultCodeResponseEnvelope> call, Throwable t) {

            }
        });*/
    }
}