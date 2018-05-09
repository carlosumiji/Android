package br.com.fiap.nac02.RM78909;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarBata(View view) {

        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                Intent it = new Intent(MainActivity.this,Batata2Activity.class);
                startActivity(it);
            }
        });
    }

    public void mostrarSorvete(View view) {
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                Intent it = new Intent(MainActivity.this,SorveteActivity.class);
                startActivity(it);
            }
        });
    }

    public void mostrarBolo(View view) {
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                Intent it = new Intent(MainActivity.this,BoloActivity.class);
                startActivity(it);
            }
        });
    }

    public void mostrarTotal(View view) {
    }
}
