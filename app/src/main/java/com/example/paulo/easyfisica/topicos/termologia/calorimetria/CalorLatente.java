package com.example.paulo.easyfisica.topicos.termologia.calorimetria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.paulo.easyfisica.R;

import org.w3c.dom.Text;

public class CalorLatente extends AppCompatActivity {

    private EditText edt_massa;
    private EditText edt_calordetroca;
    private Button btn_calcular;
    private TextView txt_resultcalorlatente;
    private Button btn_voltar;
    private Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calor_latente);

        edt_massa = (EditText) findViewById(R.id.edt_massa);
        edt_calordetroca = (EditText) findViewById(R.id.edt_calordetroca);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        txt_resultcalorlatente = (TextView) findViewById(R.id.txt_resultcalorlatente);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double m = Double.parseDouble(edt_massa.getText().toString());
                double l = Double.parseDouble(edt_calordetroca.getText().toString());

                resultado = calcularCalorLatente(m, l);
                txt_resultcalorlatente.setText(resultado.toString());
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalorLatente.this, Calorimetria.class);
                startActivity(intent);
            }
        });
    }

    public double calcularCalorLatente(double m, double l){
        return (m * l);
    }
}
