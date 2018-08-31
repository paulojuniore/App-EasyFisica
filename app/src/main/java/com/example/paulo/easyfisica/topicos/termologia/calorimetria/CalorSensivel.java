package com.example.paulo.easyfisica.topicos.termologia.calorimetria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.paulo.easyfisica.R;

public class CalorSensivel extends AppCompatActivity {

    private EditText edt_calorespecifico;
    private EditText edt_massadocorpo;
    private EditText edt_variacaodatemperatura;
    private Button btn_calcular;
    private TextView txt_result_qtcalorsensivel;
    private Button btn_voltar;
    private Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calor_sensivel);

        edt_calorespecifico = (EditText) findViewById(R.id.edt_calorespecifico);
        edt_massadocorpo = (EditText) findViewById(R.id.edt_massadocorpo);
        edt_variacaodatemperatura = (EditText) findViewById(R.id.edt_variacaodatemperatura);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        txt_result_qtcalorsensivel = (TextView) findViewById(R.id.result_qtcalorsensivel);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double c  = Double.parseDouble(edt_calorespecifico.getText().toString());
                double m = Double.parseDouble(edt_massadocorpo.getText().toString());
                double deltat = Double.parseDouble(edt_variacaodatemperatura.getText().toString());

                resultado = CalcularCalorSensivel(c, m, deltat);

                txt_result_qtcalorsensivel.setText(resultado.toString());

            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalorSensivel.this, Calorimetria.class);
                startActivity(intent);
            }
        });
    }

    public double CalcularCalorSensivel(double c, double m, double deltat){
        return (c * m * deltat);
    }

}
