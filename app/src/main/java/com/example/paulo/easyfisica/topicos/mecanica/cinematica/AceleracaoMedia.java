package com.example.paulo.easyfisica.topicos.mecanica.cinematica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.paulo.easyfisica.R;

import org.w3c.dom.Text;

public class AceleracaoMedia extends AppCompatActivity {

    private TextView txt_acelmedia;
    private TextView txt_formulaacelmedia;
    private EditText edt_varvelocidade;
    private EditText edt_intervalodetempo;
    private Button btn_calcular;
    private TextView txt_resultadoacelmedia;
    private TextView txt_resultacelmedia;
    private Button btn_voltar;

    private Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aceleracao_media);

        txt_acelmedia = (TextView) findViewById(R.id.txt_acelmedia);
        txt_formulaacelmedia = (TextView) findViewById(R.id.txt_formulaacelmedia);
        edt_varvelocidade = (EditText) findViewById(R.id.edt_varvelocidade);
        edt_intervalodetempo = (EditText) findViewById(R.id.edt_intervalodetempo);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        txt_resultadoacelmedia = (TextView) findViewById(R.id.txt_resultadoacelmedia);
        txt_resultacelmedia = (TextView) findViewById(R.id.txt_resultacelmedia);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double deltav = Double.parseDouble(edt_varvelocidade.getText().toString());
                double deltat = Double.parseDouble(edt_intervalodetempo.getText().toString());

                resultado = calcularVelocidadeMedia(deltav, deltat);

                txt_resultacelmedia.setText(resultado.toString());
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AceleracaoMedia.this, Cinematica.class);
                startActivity(intent);
            }
        });


    }

    public double calcularVelocidadeMedia(double deltav, double deltat){
        return (deltav / deltat);
    }

}
