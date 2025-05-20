package com.example.atividadeavaliativa;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class GeradorActivity extends AppCompatActivity {
    private EditText inputInicio, inputFim;
    private TextView textNumeroGerado;
    private Button btnGerar, btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gerador);
        inputInicio = findViewById(R.id.inputInicio);
        inputFim = findViewById(R.id.inputFim);
        textNumeroGerado = findViewById(R.id.textNumeroGerado);
        btnGerar = findViewById(R.id.btnGerar);
        btnVoltar = findViewById(R.id.btnVoltar);


        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gerarNumeroAleatorio();
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void gerarNumeroAleatorio() {
            int inicio = Integer.parseInt(inputInicio.getText().toString());
            int fim = Integer.parseInt(inputFim.getText().toString());
            Random random = new Random();
            int numeroGerado = random.nextInt((fim - inicio) + 1) + inicio;
            textNumeroGerado.setText(String.valueOf(numeroGerado));
    }

}
