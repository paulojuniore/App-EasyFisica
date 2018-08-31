package com.example.paulo.easyfisica.topicos.termologia.calorimetria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.termologia.Termologia;

public class Calorimetria extends AppCompatActivity {

    private Button btn_calorsensivel;
    private Button btn_calorlatente;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorimetria);

        btn_calorsensivel = (Button) findViewById(R.id.btn_calorsensivel);
        btn_calorlatente = (Button) findViewById(R.id.btn_calorlatente);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_calorsensivel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Calorimetria.this, CalorSensivel.class);
                startActivity(intent);
            }
        });

        btn_calorlatente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Calorimetria.this, CalorLatente.class);
                startActivity(intent);
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Calorimetria.this, Termologia.class);
                startActivity(intent);
            }
        });
    }
}
