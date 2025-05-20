package com.example.atividadeavaliativa;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InversorResultadoActivity extends Activity {

    TextView textoResultado;
    Button btnvoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inversor_resultado);

        textoResultado = findViewById(R.id.textoResultado);
        btnvoltar = findViewById(R.id.btnvoltar);

        String textoOriginal = getIntent().getStringExtra("texto_original");

        if (textoOriginal != null) {
            char[] chars = textoOriginal.toCharArray();
            StringBuilder textoInvertido = new StringBuilder();
            for (int i = chars.length - 1; i >= 0; i--) {
                textoInvertido.append(chars[i]);
            }
            textoResultado.setText(textoInvertido.toString());
        }

        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}
