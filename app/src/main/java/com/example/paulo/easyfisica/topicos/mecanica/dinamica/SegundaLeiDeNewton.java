package com.example.paulo.easyfisica.topicos.mecanica.dinamica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.paulo.easyfisica.R;

import org.w3c.dom.Text;

public class SegundaLeiDeNewton extends AppCompatActivity {

    private EditText edt_massa;
    private EditText edt_aceleracaoescalar;
    private Button btn_calcular;
    private TextView txt_resultfescalar;
    private Button btn_voltar;
    private Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_lei_de_newton);

        edt_massa = (EditText) findViewById(R.id.edt_massa);
        edt_aceleracaoescalar = (EditText) findViewById(R.id.edt_aceleracaoescalar);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        txt_resultfescalar = (TextView) findViewById(R.id.txt_resultfescalar);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double m = Double.parseDouble(edt_massa.getText().toString());
                double a = Double.parseDouble(edt_aceleracaoescalar.getText().toString());

                resultado = calcularForcaEscalarResultante(m, a);

                txt_resultfescalar.setText(resultado.toString());
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SegundaLeiDeNewton.this, Dinamica.class);
                startActivity(intent);
            }
        });


    }

    public double calcularForcaEscalarResultante(double m, double a){
        return m * a;
    }
}
