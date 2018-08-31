package com.example.paulo.easyfisica.topicos.mecanica.dinamica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.paulo.easyfisica.R;

public class PrimeiraLeiDeNewton extends AppCompatActivity {

    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_lei_de_newton);

        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrimeiraLeiDeNewton.this, Dinamica.class);
                startActivity(intent);
            }
        });
    }
}
