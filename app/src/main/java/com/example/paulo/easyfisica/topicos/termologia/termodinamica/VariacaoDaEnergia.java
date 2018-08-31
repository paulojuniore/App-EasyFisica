package com.example.paulo.easyfisica.topicos.termologia.termodinamica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.paulo.easyfisica.R;

import org.w3c.dom.Text;

public class VariacaoDaEnergia extends AppCompatActivity {

    private EditText edt_numdemols;
    private EditText edt_constanteuniversal;
    private EditText edt_variacaodatemperatura;
    private Button btn_calcular;
    private TextView txt_resultvarenerinterna;
    private Button btn_voltar;
    private Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variacao_da_energia);

        edt_numdemols = (EditText) findViewById(R.id.edt_numdemols);
        edt_constanteuniversal = (EditText) findViewById(R.id.edt_constanteuniversal);
        edt_variacaodatemperatura = (EditText) findViewById(R.id.edt_variacaodatemperatura);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        txt_resultvarenerinterna = (TextView) findViewById(R.id.txt_resultvarenerinterna);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n = Double.parseDouble(edt_numdemols.getText().toString());
                double r = Double.parseDouble(edt_constanteuniversal.getText().toString());
                double deltat = Double.parseDouble(edt_variacaodatemperatura.getText().toString());

                resultado = CalcularVariacaoDaEnergiaInterna(n, r, deltat);
                txt_resultvarenerinterna.setText(resultado.toString());
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VariacaoDaEnergia.this, Termodinamica.class);
                startActivity(intent);
            }
        });
    }

    public double CalcularVariacaoDaEnergiaInterna(double n, double r, double deltat){
        return (n * r * deltat);
    }

}
