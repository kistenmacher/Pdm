package com.example.pdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    Button btn;
    private EditText editCelcius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i = 0;
        btn = findViewById(R.id.button1);
        editCelcius = findViewById(R.id.nrCelcius);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTelaNova(v);
            }
        });

        Log.d("CICLO", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CICLO", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CICLO", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("CICLO", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CICLO", "onDestroy");
    }

    public void abrirTelaNova(View view) {
        String celcius = "";
        if(editCelcius.getText() != null) {
            celcius = editCelcius.getText().toString();
        }
        Intent intent = new Intent(this, OutraActivity.class);
        intent.putExtra("celcius", celcius);
        startActivity(intent);
    }

}
