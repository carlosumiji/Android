package br.com.fiap.nac01.rm78909;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdgProdutos;
    EditText edtMedida;
    CheckBox chkSuperFrete;
    TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdgProdutos = findViewById(R.id.rdgProdutos);
        edtMedida = findViewById(R.id.edtMedida);
        chkSuperFrete= findViewById(R.id.chkSuperFrete);
        txtResultado= findViewById(R.id.txtResultado);
    }

    public void Calcular(View view) {
        double resultado = 0;
        double medida = Double.parseDouble(edtMedida.getText().toString());

        int selecionado = rdgProdutos.getCheckedRadioButtonId();

        switch (selecionado){
            case R.id.rdbPisoBranco:
                resultado = 24.9 * medida;
                break;
            case R.id.rdbPisoAlbania:
                resultado = 11.9 * medida;
                break;
            case R.id.rdbPorcelanato:
                resultado = 39.9 * medida;
                break;
            case R.id.rdbRevestimento:
                resultado = 16.9 * medida;
                break;
        }
        if(chkSuperFrete.isChecked()){
            resultado *= 1.3;
        }
        txtResultado.setText(String.format("R$ %.2f", resultado));
    }
}
