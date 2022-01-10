package com.example.sendep.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.sendep.R;
import com.example.sendep.service.ServiceGenerator;
import com.example.sendep.service.ServiceInterfaceConsultCode;
import com.example.sendep.utils.MaskEditUtil;

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
                    
                }else{
                    Toast.makeText(getApplicationContext(), "Sem conexão à internet", Toast.LENGTH_LONG).show();
                }
            }
        });

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

    //Método para verificar se tem acesso a internet
    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }
}