package com.example.paulo.easyfisica.topicos.termologia.dilatacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.paulo.easyfisica.R;

public class DilatacaoLinear extends AppCompatActivity {

    private EditText edt_comprimentoinicial;
    private EditText edt_coeficientededilatacaolinear;
    private EditText edt_vardatemperatura;
    private Button btn_calcular;
    private TextView txt_resultvarcomprimento;
    private Button btn_voltar;
    private Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilatacao_linear);

        edt_comprimentoinicial = (EditText) findViewById(R.id.edt_comprimentoinicial);
        edt_coeficientededilatacaolinear = (EditText) findViewById(R.id.edt_coeficientededilatacaolinear);
        edt_vardatemperatura = (EditText) findViewById(R.id.edt_vardatemperatura);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        txt_resultvarcomprimento = (TextView) findViewById(R.id.txt_resultvarcomprimento);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double lo = Double.parseDouble(edt_comprimentoinicial.getText().toString());
                double alfa = Double.parseDouble(edt_coeficientededilatacaolinear.getText().toString());
                double delta0 = Double.parseDouble(edt_vardatemperatura.getText().toString());

                resultado = CalcularVariacaoDoComprimento(lo, alfa, delta0);

                txt_resultvarcomprimento.setText(resultado.toString());
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DilatacaoLinear.this, Dilatacao.class);
                startActivity(intent);
            }
        });

    }

    public double CalcularVariacaoDoComprimento(double lo, double alfa, double delta0){
        return (lo * alfa * delta0);
    }
}
