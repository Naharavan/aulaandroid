package com.example.new2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Resultado;
    private TextView N1;
    private TextView N2;
    private Button Calculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resultado = findViewById(R.id.Resultado);
        N1 = findViewById(R.id.N1);
        N2 = findViewById(R.id.N2);
        Calculo = findViewById(R.id.Calc);

        Calculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double n1 = Integer.parseInt(String.valueOf(N1.getText()));
                double n2 = Integer.parseInt(String.valueOf(N2.getText()));
                double res = (n1 * 0.300) + (n2 * 0.250);
                Resultado.setText("Resultado:" + res + "Kilos de carne");


            }
        });
    }
}