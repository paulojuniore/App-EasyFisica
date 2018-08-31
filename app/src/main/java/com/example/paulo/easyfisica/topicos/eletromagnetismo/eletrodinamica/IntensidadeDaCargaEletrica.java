package com.example.paulo.easyfisica.topicos.eletromagnetismo.eletrodinamica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.paulo.easyfisica.R;

public class IntensidadeDaCargaEletrica extends AppCompatActivity {

    private EditText edt_q;
    private EditText edt_deltat;
    private Button btn_calcular;
    private TextView txt_resultintensidade;
    private Button btn_voltar;
    private Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intensidade_da_carga_eletrica);

        edt_q = (EditText) findViewById(R.id.edt_q);
        edt_deltat = (EditText) findViewById(R.id.edt_deltat);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        txt_resultintensidade = (TextView) findViewById(R.id.txt_resultintensidade);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double q = Double.parseDouble(edt_q.getText().toString());
                double deltat = Double.parseDouble(edt_deltat.getText().toString());

                resultado = CalcularIntensidadeDaCargaEletrica(q, deltat);

                txt_resultintensidade.setText(resultado.toString());
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IntensidadeDaCargaEletrica.this, EletroDinamica.class);
                startActivity(intent);
            }
        });
    }

    public double CalcularIntensidadeDaCargaEletrica(double q, double deltat){
        return (q / deltat);
    }

}
