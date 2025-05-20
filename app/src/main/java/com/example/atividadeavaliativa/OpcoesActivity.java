package com.example.atividadeavaliativa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OpcoesActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes);
        Button btngerador = findViewById(R.id.btngerador);
        Button btninversor = findViewById(R.id.btninversor);
        Button btnregistro = findViewById(R.id.btnregistro);

        btngerador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(OpcoesActivity.this, GeradorActivity.class);
                startActivity(intent);
            }
        });

        btninversor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(OpcoesActivity.this, InversorActivity.class);
                startActivity(intent);
            }
        });

        btnregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(OpcoesActivity.this, RegistroActivity.class);
                startActivity(intent);
            }
        });
    }
}
