package com.example.navdrawer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Sintomas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sintomas);

        final Button btPCR = (Button) findViewById(R.id.BtPCR);
        btPCR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar();
            }
        });
    }

    public void llamar(){
        Intent intentTfno = new Intent(Intent.ACTION_DIAL);
        intentTfno.setData(Uri.parse("tel:900121212"));
        startActivity(intentTfno);
    }
}