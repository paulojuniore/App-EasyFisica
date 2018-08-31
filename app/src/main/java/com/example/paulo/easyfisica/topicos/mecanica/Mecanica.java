package com.example.paulo.easyfisica.topicos.mecanica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.Topico;
import com.example.paulo.easyfisica.topicos.mecanica.cinematica.Cinematica;
import com.example.paulo.easyfisica.topicos.mecanica.dinamica.Dinamica;

public class Mecanica extends AppCompatActivity {

    private Button btn_cinematica;
    private Button btn_dinamica;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mecanica);

        btn_cinematica = (Button) findViewById(R.id.btn_cinematica);
        btn_dinamica = (Button) findViewById(R.id.btn_dinamica);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_cinematica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mecanica.this, Cinematica.class);
                startActivity(intent);
            }
        });

        btn_dinamica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mecanica.this, Dinamica.class);
                startActivity(intent);
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mecanica.this, Topico.class);
                startActivity(intent);
            }
        });
    }
}
