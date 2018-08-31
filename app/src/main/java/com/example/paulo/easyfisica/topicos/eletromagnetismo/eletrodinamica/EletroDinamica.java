package com.example.paulo.easyfisica.topicos.eletromagnetismo.eletrodinamica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.eletromagnetismo.Eletromagnetismo;

public class EletroDinamica extends AppCompatActivity {

    private Button btn_intensidade;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eletro_dinamica);

        btn_intensidade = (Button) findViewById(R.id.btn_intensidade);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_intensidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EletroDinamica.this, IntensidadeDaCargaEletrica.class);
                startActivity(intent);
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EletroDinamica.this, Eletromagnetismo.class);
                startActivity(intent);
            }
        });
    }
}
