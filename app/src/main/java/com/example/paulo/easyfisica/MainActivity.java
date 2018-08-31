package com.example.paulo.easyfisica;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.paulo.easyfisica.topicos.Topico;

public class MainActivity extends Activity {

    private Button btn_formulas;
    private Button btn_sobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        btn_formulas = (Button) findViewById(R.id.btn_formulas);
        btn_sobre = (Button) findViewById(R.id.btn_sobre);

        btn_formulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Topico.class);
                startActivity(intent);
            }
        });

        btn_sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sobre.class);
                startActivity(intent);
            }
        });
    }

}
