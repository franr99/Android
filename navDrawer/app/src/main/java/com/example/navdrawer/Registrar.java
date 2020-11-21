package com.example.navdrawer;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Registrar extends AppCompatActivity {

    private ControlRegistrar cr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrar);

        cr = findViewById(R.id.Cntrolregistrar);
    }


}
