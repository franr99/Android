package com.example.navdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class PosiblesSintomas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.posibles_sintomas);

        final CheckBox fiebre = (CheckBox)findViewById(R.id.CbFiebre);
        final CheckBox gusto = (CheckBox)findViewById(R.id.CbGusto);
        final CheckBox cabeza = (CheckBox)findViewById(R.id.CbCabeza);
        final CheckBox diarrea = (CheckBox)findViewById(R.id.CbDiarrea);
        final CheckBox fatiga = (CheckBox)findViewById(R.id.CbFatiga);
        final Button BtSintomas = (Button) findViewById(R.id.BtSintomas);

        BtSintomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if(fiebre.isChecked() && fatiga.isChecked()){
                        posiblePositivo();
                    }else if(cabeza.isChecked() && fatiga.isChecked() && gusto.isChecked()){
                        posiblePositivo();
                    }else if(diarrea.isChecked() && fatiga.isChecked() && gusto.isChecked()){
                        posiblePositivo();
                    }else{
                        posibleNegativo();
                    }

            }

        });
    }

    public void posiblePositivo(){
        Intent intent= new Intent(this,  Sintomas.class);
        startActivity(intent);
    }

    public void posibleNegativo(){

    }
}