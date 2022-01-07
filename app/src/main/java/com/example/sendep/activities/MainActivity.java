package com.example.sendep.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
    private Button btnConsult, btnTracking;

    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnConsult = findViewById(R.id.btn_consultHome);
        btnTracking = findViewById(R.id.btn_trackHome);


        btnConsult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ConsultCodeActivity.class);
                startActivity(intent);
            }
        });

        btnTracking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TrackingActivity.class);
                startActivity(intent);
            }
        });

    }
}