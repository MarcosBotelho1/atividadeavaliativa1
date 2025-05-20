package com.example.atividadeavaliativa;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import java.util.ArrayList;
import java.util.Calendar;
import androidx.appcompat.app.AppCompatActivity;

public class RegistroActivity extends AppCompatActivity {

    EditText editTextoEvento, editData;
    Button btnGravar;
    ListView listEventos;
    ArrayList<String> listaDados;
    ArrayAdapter<String> adapter;
    int contador = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        editTextoEvento = findViewById(R.id.edittextoevento);
        editData = findViewById(R.id.editdata);
        btnGravar = findViewById(R.id.btngravar);
        listEventos = findViewById(R.id.listeventos);

        listaDados = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaDados);
        listEventos.setAdapter(adapter);

        editData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDatePicker();
            }
        });

        btnGravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto, linha, data;

                texto = editTextoEvento.getText().toString().trim();
                data = editData.getText().toString().trim();

                if (texto.isEmpty() || data.isEmpty()) {
                    Toast.makeText(RegistroActivity.this, "Preencha o texto e a data!", Toast.LENGTH_SHORT).show();
                    return;
                }

                linha = contador + " | " + data + " | " + texto;

                listaDados.add(linha);
                adapter.notifyDataSetChanged();
                contador++;
                editTextoEvento.setText("");
                editData.setText("");
            }
        });
    }

    private void abrirDatePicker() {
        final Calendar c = Calendar.getInstance();
        int ano = c.get(Calendar.YEAR);
        int mes = c.get(Calendar.MONTH);
        int dia = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpd = new DatePickerDialog(this, (view, year, monthOfYear, dayOfMonth) -> {
            String dataEscolhida = String.format("%02d/%02d/%04d", dayOfMonth, monthOfYear + 1, year);
            editData.setText(dataEscolhida);
        }, ano, mes, dia);
        dpd.show();
    }
}