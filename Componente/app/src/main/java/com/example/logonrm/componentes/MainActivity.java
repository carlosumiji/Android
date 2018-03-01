package com.example.logonrm.componentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Boolean imagemAlterada = false;
    ImageView imgPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPessoa = findViewById(R.id.imgPessoa);
    }

    public void alterarImagem(View view) {
        if(! imagemAlterada) {
            imgPessoa.setImageResource(R.drawable.person2);
            imagemAlterada = true;
        }else{
            imgPessoa.setImageResource((R.drawable.person1));
            imagemAlterada = false;
        }
    }
}
