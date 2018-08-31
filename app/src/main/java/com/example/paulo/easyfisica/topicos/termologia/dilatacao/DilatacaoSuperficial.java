package com.example.paulo.easyfisica.topicos.termologia.dilatacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.paulo.easyfisica.R;

public class DilatacaoSuperficial extends AppCompatActivity {
    private EditText edt_areainicial;
    private EditText edt_coeficientededilatacaosuperficial;
    private EditText edt_vardatemperatura;
    private Button btn_calcular;
    private TextView txt_resultvardaarea;
    private Button btn_voltar;
    private Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilatacao_superficial);

        edt_areainicial = (EditText) findViewById(R.id.edt_areainicial);
        edt_coeficientededilatacaosuperficial = (EditText) findViewById(R.id.edt_coeficientededilatacaosuperficial);
        edt_vardatemperatura = (EditText) findViewById(R.id.edt_vardatemperatura);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        txt_resultvardaarea = (TextView) findViewById(R.id.txt_resultvardaarea);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double deltas = Double.parseDouble(edt_areainicial.getText().toString());
                double beta = Double.parseDouble(edt_coeficientededilatacaosuperficial.getText().toString());
                double delta0 = Double.parseDouble(edt_vardatemperatura.getText().toString());

                resultado = CalcularDilatacaoSuperficial(deltas, beta, delta0);

                txt_resultvardaarea.setText(resultado.toString());
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DilatacaoSuperficial.this, Dilatacao.class);
                startActivity(intent);
            }
        });

    }

    public double CalcularDilatacaoSuperficial(double deltas, double beta, double delta0){
        return (deltas * beta * delta0);
    }

}
