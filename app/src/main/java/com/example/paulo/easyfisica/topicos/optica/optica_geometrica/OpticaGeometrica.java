package com.example.paulo.easyfisica.topicos.optica.optica_geometrica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.optica.Optica;

public class OpticaGeometrica extends AppCompatActivity {

    private Button btn_leidarefracao;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optica_geometrica);

        btn_leidarefracao = (Button) findViewById(R.id.btn_leidarefracao);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_leidarefracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OpticaGeometrica.this, LeiDaRefracao.class);
                startActivity(intent);
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OpticaGeometrica.this, Optica.class);
                startActivity(intent);
            }
        });
    }
}
