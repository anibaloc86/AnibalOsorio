package com.anibalosorio.myapplication_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity_3 extends AppCompatActivity {

    EditText area;
    Button bCalcular;
    RadioButton rCir, rCua, rTri, rRect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_3);

        area = (EditText) findViewById(R.id.area);
        bCalcular = (Button) findViewById(R.id.bCal);
        rCir = (RadioButton) findViewById(R.id.rCir);
        rCua = (RadioButton) findViewById(R.id.rCua);
        rTri = (RadioButton) findViewById(R.id.rTri);
        rRect = (RadioButton) findViewById(R.id.rRect);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double base, altura, lado, radio, resul;

                base = Double.parseDouble(bas.getText().toString());
                altura = Double.parseDouble(alt.getText().toString());
                lado = Double.parseDouble(lad.getText().toString());
                radio = Double.parseDouble(rad.getText().toString());


                if (rCir.isChecked() == true) {
                    resul = 3.14*radio*radio;
                    area.setText(String.valueOf(resul));
                } else
                if (rCua.isChecked() == true) {
                    resul = lado*lado;
                    area.setText(String.valueOf(resul));
                } else if (rTri.isChecked() == true) {
                    resul = (base*altura)/2;
                    area.setText(String.valueOf(resul));
                } else if (rRect.isChecked() == true) {
                    resul = base*altura;
                    area.setText(String.valueOf(resul));
                }


            }
        });
    }
}
