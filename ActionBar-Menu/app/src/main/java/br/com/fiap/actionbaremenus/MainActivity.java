package br.com.fiap.actionbaremenus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setLogo(R.mipmap.ic_launcher_round);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.mniAdicionar:
                Toast.makeText(this,R.string.clicou_em_adicionar,Toast.LENGTH_SHORT).show();
                break;

            case R.id.mniSobre:
                Toast.makeText(this,R.string.clicou_em_sobre,Toast.LENGTH_SHORT).show();
                break;

            case R.id.mniSair:
                finish();
                break;

            case android.R.id.home:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
