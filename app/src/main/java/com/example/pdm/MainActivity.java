package com.example.pdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    Button btnAula2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAula2 = findViewById(R.id.btnAula2);
        btnAula2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirAula2(v);
            }
        });
    }

    public void abrirAula2(View view) {
        Intent intent = new Intent(this, Aula2Activity.class);
        startActivity(intent);
    }

}
