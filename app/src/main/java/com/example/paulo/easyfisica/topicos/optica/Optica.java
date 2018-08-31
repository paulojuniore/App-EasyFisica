package com.example.paulo.easyfisica.topicos.optica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.Topico;
import com.example.paulo.easyfisica.topicos.optica.optica_geometrica.OpticaGeometrica;

public class Optica extends AppCompatActivity {

    private Button btn_opticageometrica;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optica);

        btn_opticageometrica = (Button) findViewById(R.id.btn_opticageometrica);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_opticageometrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Optica.this, OpticaGeometrica.class);
                startActivity(intent);
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Optica.this, Topico.class);
                startActivity(intent);
            }
        });
    }
}
