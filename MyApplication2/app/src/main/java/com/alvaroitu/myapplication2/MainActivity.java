package com.alvaroitu.myapplication2;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText editTextNome;
    EditText editTextValor;
    RadioGroup radioGroup;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Locale.setDefault(new Locale("pt", "BR"));

        editTextNome = findViewById(R.id.editTextTextPersonName);
        editTextValor = findViewById(R.id.editTextNumberDecimal);
        radioGroup = findViewById(R.id.radioGroup);
        textView2 = findViewById(R.id.textView2);

        final DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#,##0.00");

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                double valorFinal = 0;
                String moeda = "";

                String nome = editTextNome.getText().toString();
                Double valor = Double.parseDouble(editTextValor.getText().toString());

                Integer valueSelected = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButtonMoeda = findViewById(valueSelected);
                String valueMulti = radioButtonMoeda.getText().toString();

                if(valueMulti.equals("Dólar")){
                    valorFinal = valor * 5.0642;
                    moeda = " dólares";
                }
                if(valueMulti.equals("Euro")){
                    valorFinal = valor * 5.3087;
                    moeda = " euros";
                }
                if(valueMulti.equals("Libra")){
                    valorFinal = valor * 6.1137;
                    moeda = " libras";
                }

                textView2.setText("Prezado(a): " + nome +
                        "\n Se você tiver um salário de " + decimalFormat.format(valor) + moeda +
                        "\n Você vai receber " + decimalFormat.format(valorFinal) + " reais por mês");

            }
        });
    }
}