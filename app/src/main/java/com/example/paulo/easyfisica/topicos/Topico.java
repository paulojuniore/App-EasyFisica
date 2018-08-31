package com.example.paulo.easyfisica.topicos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.paulo.easyfisica.MainActivity;
import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.eletromagnetismo.Eletromagnetismo;
import com.example.paulo.easyfisica.topicos.mecanica.Mecanica;
import com.example.paulo.easyfisica.topicos.ondulatoria.Ondulatoria;
import com.example.paulo.easyfisica.topicos.optica.Optica;
import com.example.paulo.easyfisica.topicos.termologia.Termologia;

public class Topico extends AppCompatActivity {

    private Button btn_mecanica;
    private Button btn_termologia;
    private Button btn_optica;
    private Button btn_ondulatoria;
    private Button btn_eletromagnetismo;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topico);

        btn_mecanica = (Button) findViewById(R.id.btn_mecanica);
        btn_termologia = (Button) findViewById(R.id.btn_termologia);
        btn_optica = (Button) findViewById(R.id.btn_optica);
        btn_ondulatoria = (Button) findViewById(R.id.btn_ondulatoria);
        btn_eletromagnetismo = (Button) findViewById(R.id.btn_eletromagnetismo);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_mecanica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Topico.this, Mecanica.class);
                startActivity(intent);
            }
        });

        btn_termologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Topico.this, Termologia.class);
                startActivity(intent);
            }
        });

        btn_optica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Topico.this, Optica.class);
                startActivity(intent);
            }
        });

        btn_ondulatoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Topico.this, Ondulatoria.class);
                startActivity(intent);
            }
        });

        btn_eletromagnetismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Topico.this, Eletromagnetismo.class);
                startActivity(intent);
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Topico.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
