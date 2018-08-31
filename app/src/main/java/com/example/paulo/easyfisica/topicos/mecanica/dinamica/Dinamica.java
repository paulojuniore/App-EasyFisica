package com.example.paulo.easyfisica.topicos.mecanica.dinamica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.mecanica.Mecanica;

public class Dinamica extends AppCompatActivity {

    private Button btn_primeiraleidenewton;
    private Button btn_segundaleidenewton;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinamica);

        btn_primeiraleidenewton = (Button) findViewById(R.id.btn_primeiraleidenewton);
        btn_segundaleidenewton = (Button) findViewById(R.id.btn_segundaleidenewton);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_primeiraleidenewton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dinamica.this, PrimeiraLeiDeNewton.class);
                startActivity(intent);
            }
        });

        btn_segundaleidenewton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dinamica.this, SegundaLeiDeNewton.class);
                startActivity(intent);
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dinamica.this, Mecanica.class);
                startActivity(intent);
            }
        });
    }
}
