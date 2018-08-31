package com.example.paulo.easyfisica.topicos.termologia.dilatacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.termologia.Termologia;

public class Dilatacao extends AppCompatActivity {

    private Button btn_dilatacaolinear;
    private Button btn_dilatacaosuperficial;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilatacao);

        btn_dilatacaolinear = (Button) findViewById(R.id.btn_dilatacaolinear);
        btn_dilatacaosuperficial = (Button) findViewById(R.id.btn_dilatacaosuperficial);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_dilatacaolinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dilatacao.this, DilatacaoLinear.class);
                startActivity(intent);
            }
        });

        btn_dilatacaosuperficial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dilatacao.this, DilatacaoSuperficial.class);
                startActivity(intent);
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dilatacao.this, Termologia.class);
                startActivity(intent);
            }
        });
    }
}
