package com.example.paulo.easyfisica.topicos.eletromagnetismo.eletrostatica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.eletromagnetismo.Eletromagnetismo;

public class Eletrostatica extends AppCompatActivity {

    private Button btn_carga;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eletrostatica);

        btn_carga = (Button) findViewById(R.id.btn_carga);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_carga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Eletrostatica.this, CargaEletrica.class);
                startActivity(intent);
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Eletrostatica.this, Eletromagnetismo.class);
                startActivity(intent);
            }
        });
    }
}
