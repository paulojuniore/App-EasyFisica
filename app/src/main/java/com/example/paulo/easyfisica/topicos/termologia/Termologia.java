package com.example.paulo.easyfisica.topicos.termologia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.Topico;
import com.example.paulo.easyfisica.topicos.termologia.calorimetria.Calorimetria;
import com.example.paulo.easyfisica.topicos.termologia.dilatacao.Dilatacao;
import com.example.paulo.easyfisica.topicos.termologia.termodinamica.Termodinamica;

public class Termologia extends AppCompatActivity {

    private Button btn_calorimetria;
    private Button btn_termodinamica;
    private Button btn_dilatacao;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termologia);

        btn_calorimetria = (Button) findViewById(R.id.btn_calorimetria);
        btn_termodinamica = (Button) findViewById(R.id.btn_termodinamica);
        btn_dilatacao = (Button) findViewById(R.id.btn_dilatacao);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_calorimetria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Termologia.this, Calorimetria.class);
                startActivity(intent);
            }
        });

        btn_termodinamica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Termologia.this, Termodinamica.class);
                startActivity(intent);
            }
        });

        btn_dilatacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Termologia.this, Dilatacao.class);
                startActivity(intent);
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Termologia.this, Topico.class);
                startActivity(intent);
            }
        });
    }
}
