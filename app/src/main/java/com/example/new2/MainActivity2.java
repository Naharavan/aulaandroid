package com.example.new2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView Resultado;
    private TextView hN1;
    private TextView mN2;
    private Button Calculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resultado = findViewById(R.id.resultado);
        hN1 = findViewById(R.id.homens);
        mN2 = findViewById(R.id.mulheres);
        Calculo = findViewById(R.id.calcular);

        Calculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double n1 = Integer.parseInt(String.valueOf(hN1.getText()));
                double n2 = Integer.parseInt(String.valueOf(mN2.getText()));
                double res = (n1 * 0.300) + (n2 * 0.250);
                Resultado.setText("Resultado:" + res + "Kilos de carne");


            }
        });
    }
}