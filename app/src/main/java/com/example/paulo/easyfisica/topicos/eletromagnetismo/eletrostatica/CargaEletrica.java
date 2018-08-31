package com.example.paulo.easyfisica.topicos.eletromagnetismo.eletrostatica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.paulo.easyfisica.R;

public class CargaEletrica extends AppCompatActivity {

    private EditText edt_numdecargas;
    private EditText edt_cargaelementar;
    private Button btn_calcular;
    private TextView txt_resultcarga;
    private Button btn_voltar;
    private Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carga_eletrica);

        edt_numdecargas = (EditText) findViewById(R.id.edt_numdecargas);
        edt_cargaelementar = (EditText) findViewById(R.id.edt_cargaelementar);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        txt_resultcarga = (TextView) findViewById(R.id.txt_resultcarga);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n = Double.parseDouble(edt_numdecargas.getText().toString());
                double e = Double.parseDouble(edt_cargaelementar.getText().toString());

                resultado = CalcularCargaEletrica(n, e);

                txt_resultcarga.setText(resultado.toString());
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CargaEletrica.this,  Eletrostatica.class);
                startActivity(intent);
            }
        });
    }

    public double CalcularCargaEletrica(double n, double e){
        return (n * e);
    }
}
