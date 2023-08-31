package com.alvaroitu.aula_2_views;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button botaoMudar;
    TextView textViewPrimeiroApp;
    EditText editTextEntrada;
    TextView textViewResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoMudar = findViewById(R.id.botaoMudar);
        textViewPrimeiroApp = findViewById(R.id.textViewPrimeiroApp);
        editTextEntrada = findViewById(R.id.editTextEntrada);
        textViewResultado = findViewById(R.id.textViewResultado);

        botaoMudar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textViewPrimeiroApp.setText("Olá Mundo!!!");

                String resultado = editTextEntrada.getText().toString();

                textViewResultado.setText(resultado);

                Toast.makeText(MainActivity.this, textViewPrimeiroApp.getText()
                        + " "
                        + textViewResultado.getText(), Toast.LENGTH_LONG).show();

            }
        });
    }
}