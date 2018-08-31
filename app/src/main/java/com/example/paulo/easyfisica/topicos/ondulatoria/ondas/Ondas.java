package com.example.paulo.easyfisica.topicos.ondulatoria.ondas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.ondulatoria.Ondulatoria;

public class Ondas extends AppCompatActivity {

    private Button btn_velocidadepropagacao;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ondas);

        btn_velocidadepropagacao = (Button) findViewById(R.id.btn_velocidadepropagacao);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_velocidadepropagacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Ondas.this, VelocidadeDePropagacao.class);
                startActivity(intent);
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ondas.this, Ondulatoria.class);
                startActivity(intent);
            }
        });
    }
}
