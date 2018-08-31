package com.example.paulo.easyfisica.topicos.termologia.termodinamica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.paulo.easyfisica.R;
import com.example.paulo.easyfisica.topicos.mecanica.dinamica.PrimeiraLeiDeNewton;

public class PrimeiraLeiDaTermodinamica extends AppCompatActivity {

    private EditText edt_trabalho;
    private EditText edt_vardeenerinterna;
    private Button btn_calcular;
    private TextView txt_resultprimeiralei;
    private Button btn_voltar;

    private Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_lei_da_termodinamica);

        edt_trabalho = (EditText) findViewById(R.id.edt_trabalho);
        edt_vardeenerinterna = (EditText) findViewById(R.id.edt_vardeenerinterna);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        txt_resultprimeiralei = (TextView) findViewById(R.id.txt_resultprimeiralei);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double t = Double.parseDouble(edt_trabalho.getText().toString());
                double deltau = Double.parseDouble(edt_vardeenerinterna.getText().toString());

                resultado = CalcularPrimeiraLeidaTermodinamica(t, deltau);
                txt_resultprimeiralei.setText(resultado.toString());
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrimeiraLeiDaTermodinamica.this, Termodinamica.class);
                startActivity(intent);
            }
        });
    }

    public double CalcularPrimeiraLeidaTermodinamica(double t, double deltau){
        return (t + deltau);
    }
}
