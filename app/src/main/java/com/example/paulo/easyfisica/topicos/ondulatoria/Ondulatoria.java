package com.example.paulo.easyfisica.topicos.ondulatoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.Topico;
import com.example.paulo.easyfisica.topicos.ondulatoria.ondas.Ondas;

public class Ondulatoria extends AppCompatActivity {

    private Button btn_ondas;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ondulatoria);

        btn_ondas = (Button) findViewById(R.id.btn_ondas);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_ondas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ondulatoria.this, Ondas.class);
                startActivity(intent);
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ondulatoria.this, Topico.class);
                startActivity(intent);
            }
        });
    }
}
