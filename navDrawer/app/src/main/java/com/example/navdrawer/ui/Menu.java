package com.example.navdrawer.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.navdrawer.PosiblesSintomas;
import com.example.navdrawer.R;
import com.example.navdrawer.Sintomas;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab2);

    }



    public void comprobarSintomas(){
        Intent intent= new Intent(this,  PosiblesSintomas.class);
        startActivity(intent);
    }
}
