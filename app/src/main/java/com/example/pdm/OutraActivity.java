package com.example.pdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OutraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outra);

        Intent intent = getIntent();
        String valorRecebido = intent.getStringExtra("celcius");
        TextView tv = findViewById(R.id.nrFahr);
        if(valorRecebido != null && !valorRecebido.isEmpty()){
            double celcius = Double.parseDouble(valorRecebido);
            double fahr = (celcius * 9/5)+32;
            tv.setText(String.valueOf(fahr));
        }else{
            tv.setText("Não foi possível reconhecer a temperatura informada.");
        }


    }
}
