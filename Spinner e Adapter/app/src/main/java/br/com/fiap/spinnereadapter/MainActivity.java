package br.com.fiap.spinnereadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView actPaises;
    Spinner spnPaises;
    String[]paises = {
        "Alemanha",
        "Belize",
        "Camarões",
        "Dinamarca",
        "Espanha",
        "Finlândia"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnPaises = findViewById(R.id.spnPaises);
        actPaises = findViewById(R.id.actPaises);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(
            this,
             android.R.layout.simple_list_item_1,
             paises
        );

        spnPaises.setAdapter(adapter);

        spnPaises.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String pais = paises[position];
                Toast.makeText(MainActivity.this,"Você selecionou " + pais, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        ArrayAdapter<String>adapterParaAutoCompletar = new ArrayAdapter<String>(
             this,
                android.R.layout.simple_list_item_1,
                paises
        );

        actPaises.setAdapter(adapterParaAutoCompletar);
    }

    public void salvar(View view) {
        String pais = spnPaises.getSelectedItem().toString();
        Toast.makeText(this,"Você selecionou " + pais, Toast.LENGTH_SHORT).show();
    }
}
