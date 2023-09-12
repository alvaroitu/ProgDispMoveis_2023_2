package com.alvaroitu.aula_3x1_switch_togglebutton;

import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Switch switchButton;
    ToggleButton toggleButton;
    TextView switchResultado;
    TextView toggleResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchButton = findViewById(R.id.switchButton);
        toggleButton = findViewById(R.id.toggleButton);
        switchResultado = findViewById(R.id.switchResultado);
        toggleResultado = findViewById(R.id.toggleResultado);

        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (switchButton.isChecked()){

                    switchResultado.setText("O Palmeiras TEM Mundial!!!");
                } else {

                    switchResultado.setText("O Palmeiras NÃO TEM Mundial!!!");
                }

            }
        });

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (toggleButton.isChecked()){
                    toggleResultado.setText("Toggle Ligado");
                } else {
                    toggleResultado.setText("Toggle Desligado");
                }

            }
        });
    }
}