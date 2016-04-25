package com.anibalosorio.myapplication_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity_2 extends AppCompatActivity {

    EditText num1, num2;
    Button Bcal;
    TextView total;
    RadioButton rsuma, rresta, rmulti, rdivi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_2);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        rsuma = (RadioButton) findViewById(R.id.rsuma);
        rresta = (RadioButton) findViewById(R.id.rresta);
        rmulti = (RadioButton) findViewById(R.id.rmulti);
        rdivi = (RadioButton) findViewById(R.id.rdivi);
        Bcal = (Button) findViewById(R.id.Bcal);


        Bcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1, numero2,suma, resta, multi, divi;

                numero1 = Double.parseDouble(num1.getText().toString());
                numero2 = Double.parseDouble(num2.getText().toString());

                if (rsuma.isChecked() == true) {
                    suma = numero1 + numero2;
                    total.setText(String.valueOf(suma));
                } else
                if (rresta.isChecked() == true) {
                    resta = numero1 - numero2;
                    total.setText(String.valueOf(resta));
                } else if (rmulti.isChecked() == true) {
                    multi = numero1 * numero2;
                    total.setText(String.valueOf(multi));
                } else if (rdivi.isChecked() == true) {
                    divi = numero1 / numero2;
                    total.setText(String.valueOf(divi));
                }

            }
        });

    }
}

