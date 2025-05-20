package com.example.atividadeavaliativa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InversorActivity extends Activity {

    EditText editTexto;
    Button btnInverter, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inversor);

        editTexto = findViewById(R.id.editTexto);
        btnInverter = findViewById(R.id.btninverter);
        btnVoltar = findViewById(R.id.btnvoltar);

        btnInverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoOriginal = editTexto.getText().toString();
                Intent intent = new Intent(InversorActivity.this, InversorResultadoActivity.class);
                intent.putExtra("texto_original", textoOriginal);
                startActivity(intent);
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
