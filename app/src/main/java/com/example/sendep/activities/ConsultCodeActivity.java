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
import com.example.sendep.model.response.consult.ConsultCodeResponseEnvelope;
import com.example.sendep.service.ServiceGenerator;
import com.example.sendep.service.ServiceInterfaceConsultCode;
import com.example.sendep.utils.MaskEditUtil;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

public class ConsultCodeActivity extends AppCompatActivity {
    private EditText cep;
    private Button btnConsult;
    private ImageButton btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult_code);

        btnConsult = findViewById(R.id.btn_consult);
        btnBack = findViewById(R.id.btn_backConsult);
        cep = findViewById(R.id.et_cep);
        //Adicionando máscara de CEP
        cep.addTextChangedListener(MaskEditUtil.mask(cep, MaskEditUtil.FORMAT_CEP));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnConsult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isNetworkConnected()){
                    Toast.makeText(getApplicationContext(), "Conectado", Toast.LENGTH_LONG).show();
                    retrofitConsultCep(cep.getText().toString());
                }else{
                    Toast.makeText(getApplicationContext(), "Sem conexão à internet", Toast.LENGTH_LONG).show();
                }
            }
        });

    }


    public void retrofitConsultCep(String code){

        ConsultCodeRequestEnvelope envelope = new ConsultCodeRequestEnvelope();
        ConsultCodeRequestData data = new ConsultCodeRequestData();
        ConsultCodeRequestBody body = new ConsultCodeRequestBody();

        data.setCep(code);

        body.setConsultCodeRequestData(data);

        envelope.setBody(body);

        /*ConsultCodeResponseEnvelope envelope = new ConsultCodeResponseEnvelope();
        ConsultCodeResponseReturn ret = new ConsultCodeResponseReturn();
        ConsultCodeResponseData data = new ConsultCodeResponseData();
        ConsultCodeResponseBody body = new ConsultCodeResponseBody();
        ret.setCep("60337-380");
        ret.setComplemento2("haha");
        ret.setBairro("Jurema");
        ret.setCidade("Fortaleza");
        ret.setUf("CE");
        ret.setEnd("Rua blabla");
        data.setConsultCodeResponseReturn(ret);
        body.setConsultCodeResponseData(data);
        envelope.setBody(body);*/

        ServiceInterfaceConsultCode service = ServiceGenerator.createService(ServiceInterfaceConsultCode.class);
        Call<ConsultCodeResponseEnvelope> call = service.consultCode(envelope);

        call.enqueue(new retrofit2.Callback<ConsultCodeResponseEnvelope>() {
            @Override
            public void onResponse(Call<ConsultCodeResponseEnvelope> call, Response<ConsultCodeResponseEnvelope> response) {
                //Verifica se de sucesso na chamada.
                if (response.isSuccessful()) {

                    ConsultCodeResponseEnvelope envelopeResponse = response.body();

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
            public void onFailure(Call<ConsultCodeResponseEnvelope> call, Throwable t) {

            }
        });
    }

    //Método para verificar se tem acesso a internet
    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }
}