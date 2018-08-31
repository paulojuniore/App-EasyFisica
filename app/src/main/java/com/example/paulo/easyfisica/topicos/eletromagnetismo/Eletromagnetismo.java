package com.example.paulo.easyfisica.topicos.eletromagnetismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.Topico;
import com.example.paulo.easyfisica.topicos.eletromagnetismo.eletrodinamica.EletroDinamica;
import com.example.paulo.easyfisica.topicos.eletromagnetismo.eletrostatica.Eletrostatica;

public class Eletromagnetismo extends AppCompatActivity {

    private Button btn_eletrostatica;
    private Button btn_eletrodinamica;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eletromagnetismo);

        btn_eletrostatica = (Button) findViewById(R.id.btn_eletrostatica);
        btn_eletrodinamica = (Button) findViewById(R.id.btn_eletrodinamica);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_eletrostatica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Eletromagnetismo.this, Eletrostatica.class);
                startActivity(intent);
            }
        });

        btn_eletrodinamica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Eletromagnetismo.this, EletroDinamica.class);
                startActivity(intent);
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Eletromagnetismo.this, Topico.class);
                startActivity(intent);
            }
        });
    }
}
