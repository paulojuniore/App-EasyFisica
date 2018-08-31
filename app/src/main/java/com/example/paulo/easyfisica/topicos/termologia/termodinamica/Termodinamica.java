package com.example.paulo.easyfisica.topicos.termologia.termodinamica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.termologia.Termologia;

public class Termodinamica extends AppCompatActivity {

    private Button btn_primeiraleidatermodinamica;
    private  Button btn_variacaodaenergia;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termodinamica);

        btn_primeiraleidatermodinamica = (Button) findViewById(R.id.btn_primeiraleidatermodinamica);
        btn_variacaodaenergia = (Button) findViewById(R.id.btn_variacaodaenergia);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_primeiraleidatermodinamica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Termodinamica.this, PrimeiraLeiDaTermodinamica.class);
                startActivity(intent);
            }
        });

        btn_variacaodaenergia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Termodinamica.this, VariacaoDaEnergia.class);
                startActivity(intent);
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Termodinamica.this, Termologia.class);
                startActivity(intent);
            }
        });
    }

}
