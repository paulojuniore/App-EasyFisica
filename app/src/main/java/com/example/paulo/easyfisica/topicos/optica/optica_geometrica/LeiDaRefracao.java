package com.example.paulo.easyfisica.topicos.optica.optica_geometrica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.paulo.easyfisica.R;

public class LeiDaRefracao extends AppCompatActivity {

    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lei_da_refracao);

        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LeiDaRefracao.this, OpticaGeometrica.class);
                startActivity(intent);
            }
        });
    }
}
