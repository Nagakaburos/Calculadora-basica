package com.estudocalccalculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtN1;
    private EditText txtN2;
    private TextView txtResultadodaSoma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtN1 = findViewById(R.id.txtN1);
        txtN2 = findViewById(R.id.txtN2);
        txtResultadodaSoma = findViewById(R.id.txtResultadodasSoma);

    }

    public void somar(View view) {
        int valor1 = Integer.parseInt(txtN1.getText().toString());
        int valor2 = Integer.parseInt(txtN2.getText().toString());
        txtResultadodaSoma.setText(String.valueOf(valor1 + valor2));
    }

    public void subtrair(View view) {
        int valor1 = Integer.parseInt(txtN1.getText().toString());
        int valor2 = Integer.parseInt(txtN2.getText().toString());
        txtResultadodaSoma.setText(String.valueOf(valor1 - valor2));

    }

    public void multiplicar(View view) {
        int valor1 = Integer.parseInt(txtN1.getText().toString());
        int valor2 = Integer.parseInt(txtN2.getText().toString());
        txtResultadodaSoma.setText(String.valueOf(valor1 * valor2));
    }

    public void dividir(View view) {
        int valor1 = Integer.parseInt(txtN1.getText().toString());
        int valor2 = Integer.parseInt(txtN2.getText().toString());
        txtResultadodaSoma.setText(String.valueOf(valor1 / valor2));
    }
}