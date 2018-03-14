package br.com.fiap.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkEstouAprendendo;
    RadioGroup rdgDificuldade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkEstouAprendendo = findViewById(R.id.chkEstouAprendendo);
        rdgDificuldade = findViewById(R.id.rdgDificuldade);
    }

    public void salvar(View view) {
        boolean checado = chkEstouAprendendo.isChecked();
        Toast.makeText(this,"Estou aprendendo? "+ checado, Toast.LENGTH_SHORT).show();
        String msg;
        int id = rdgDificuldade.getCheckedRadioButtonId();
        switch (id){
            case R.id.rdbFacil:
                msg = "Fácil selecionado";
                break;
            case R.id.rdbMedio:
                msg = "Medio selecionado";
                break;
            case R.id.rdbDificil:
                msg = "Dificil selecionado";
                break;
            default:
                msg = "Nada foi selecionado";
        }
        Toast.makeText(this, msg,Toast.LENGTH_SHORT).show();
    }
}
