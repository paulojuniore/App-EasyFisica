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

public class VelocidadeMedia extends AppCompatActivity {

    private EditText edt_dpercorrida;
    private EditText edt_intervalodetempo;
    private Button btn_calcular;
    private TextView txt_resultvelmedia;
    private Button btn_voltar;
    private Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_velocidade_media);

        edt_dpercorrida = (EditText) findViewById(R.id.edt_dpercorrida);
        edt_intervalodetempo = (EditText) findViewById(R.id.edt_intervalodetempo);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        txt_resultvelmedia = (TextView) findViewById(R.id.txt_resultvelmedia);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double deltad = Double.parseDouble(edt_dpercorrida.getText().toString());
                double deltat = Double.parseDouble(edt_intervalodetempo.getText().toString());

                resultado = calcularVelocidadeMedia(deltad, deltat);

                txt_resultvelmedia.setText(resultado.toString());
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VelocidadeMedia.this, Cinematica.class);
                startActivity(intent);
            }
        });

    }

    public double calcularVelocidadeMedia(double deltad, double deltat){
        return (deltad / deltat);
    }
}
