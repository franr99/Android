package com.example.navdrawer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class Restricciones extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restricciones);
        TextView info = findViewById(R.id.tv_confinamiento2);
        TextView info1 = findViewById(R.id.tv_confinamiento2);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info();
            }
        });

        info1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info1();
            }
        });

    }

    public void info(){
        Uri uri = Uri.parse("https://www.murciasalud.es/recursos/ficheros/468559-20201030_Regulacion_normativa_COVID_RM.pdf");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void info1(){
        Uri uri = Uri.parse("https://www.borm.es/services/anuncio/ano/2020/numero/6297/pdf?id=788956");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
