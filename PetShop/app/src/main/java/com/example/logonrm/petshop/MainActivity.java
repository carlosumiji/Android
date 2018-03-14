package com.example.logonrm.petshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    RadioGroup rdgCachorro;
    CheckBox chkFemea;
    CheckBox chkAdestrado;
    CheckBox chkVacinas;
    TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdgCachorro = findViewById(R.id.rgdCachorro);
        chkFemea = findViewById(R.id.chkFemea);
        chkAdestrado = findViewById(R.id.chkAdestrado);
        chkVacinas = findViewById(R.id.chkVacina);
        txtResultado = findViewById(R.id.txtResult);
    }

    public void Calcular(View view) {
        double valor = 0;
    int id = rdgCachorro.getCheckedRadioButtonId();
    switch (id){
        case R.id.rgBorder:
            valor = 800.00;
            break;
        case R.id.rgPitBull:
            valor = 750.00;
            break;
        case R.id.rgPastor:
            valor = 750.00;
            break;
        case R.id.rgPCanadense:
            valor = 800.00;
            break;
    }

    if (chkFemea.isChecked()){
        valor += 180;
    }
    if (chkAdestrado.isChecked()){
        valor += 400;
    }
    if (chkVacinas.isChecked()) {
        valor += 200;
    }

    txtResultado.setText(String.valueOf(valor));
    }


}
