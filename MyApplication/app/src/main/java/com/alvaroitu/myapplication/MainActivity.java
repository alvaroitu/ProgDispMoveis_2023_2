package com.alvaroitu.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText numero1;
    EditText numero2;
    Button soma;
    Button sub;
    Button multi;
    Button div;
    TextView textoSaida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        soma = findViewById(R.id.botaoSoma);
        textoSaida = findViewById(R.id.resultado);

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            int numeroEntrada1 = Integer.parseInt(
                    numero1.getText().toString());
            int numeroEntrada2 = Integer.parseInt(
                    numero2.getText().toString());
            int resultado = numeroEntrada1 + numeroEntrada2;

            textoSaida.setText(resultado);

            }
        });


    }
}