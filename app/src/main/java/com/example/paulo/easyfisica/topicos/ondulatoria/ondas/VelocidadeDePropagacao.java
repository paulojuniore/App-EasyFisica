package com.example.paulo.easyfisica.topicos.ondulatoria.ondas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.paulo.easyfisica.R;

import org.w3c.dom.Text;

public class VelocidadeDePropagacao extends AppCompatActivity {

    private EditText edt_compdeonda;
    private EditText edt_frequencia;
    private Button btn_calcular;
    private TextView txt_resultvelprop;
    private Button btn_voltar;
    private Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_velocidade_de_propagacao);

        edt_compdeonda = (EditText) findViewById(R.id.edt_compdeonda);
        edt_frequencia = (EditText) findViewById(R.id.edt_frequencia);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        txt_resultvelprop = (TextView) findViewById(R.id.txt_resultvelprop);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double lambda = Double.parseDouble(edt_compdeonda.getText().toString());
                double f = Double.parseDouble(edt_frequencia.getText().toString());

                resultado = CalcularVelocidadeDePropagacao(lambda, f);
                txt_resultvelprop.setText(resultado.toString());
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VelocidadeDePropagacao.this, Ondas.class);
                startActivity(intent);
            }
        });
    }

    private double CalcularVelocidadeDePropagacao(double lambda, double f){
        return(lambda * f);
    }
}
