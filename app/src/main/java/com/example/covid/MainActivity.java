package com.example.covid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonInformacoes;
    private Button buttonSintomas;
    private Button buttonEstatistica;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonInformacoes = findViewById(R.id.buttonInformacoes);
        buttonSintomas = findViewById(R.id.buttonSintomas);
        buttonEstatistica = findViewById(R.id.buttonEstatistica);

        buttonInformacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InformacoesActivity.class);
                startActivity(intent);
            }
        });

        buttonSintomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SintomasActivity.class);
                startActivity(intent);
            }
        });

        buttonEstatistica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EstatisticaActivity.class);
                startActivity(intent);
            }
        });

    }
}
