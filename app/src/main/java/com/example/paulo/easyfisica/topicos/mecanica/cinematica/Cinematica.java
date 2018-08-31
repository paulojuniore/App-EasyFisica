package com.example.paulo.easyfisica.topicos.mecanica.cinematica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.mecanica.Mecanica;

public class Cinematica extends AppCompatActivity {

    private TextView txt_cinematica;
    private Button btn_velmedia;
    private Button btn_acelmedia;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinematica);

        txt_cinematica = (TextView) findViewById(R.id.txt_cinematica);
        btn_velmedia = (Button) findViewById(R.id.btn_velmedia);
        btn_acelmedia = (Button) findViewById(R.id.btn_acelmedia);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_velmedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cinematica.this, VelocidadeMedia.class);
                startActivity(intent);
            }
        });

        btn_acelmedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cinematica.this, AceleracaoMedia.class);
                startActivity(intent);
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cinematica.this, Mecanica.class);
                startActivity(intent);
            }
        });
    }
}
