package com.example.navdrawer.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navdrawer.R;

public class Recomendaciones extends AppCompatActivity {

    private Sensor sensorDePresionAtm = null;
    private SensorManager sensorManager = null;
    private TextView textViewPresionAtm = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recomendaciones);

        final ImageView youtube = findViewById(R.id.youtube);
        final ImageView twitter = findViewById(R.id.twitter);
        final ImageView internet = findViewById(R.id.internet);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        textViewPresionAtm = (TextView) findViewById(R.id.sensorPresion);
        textViewPresionAtm.setTextSize(30);
        sensorDePresionAtm = sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);

        if(sensorDePresionAtm == null){
            Toast.makeText(getApplicationContext(), "No hay Sensor de Presión Atmosférica", Toast.LENGTH_SHORT).show();}
        else{
            Toast.makeText(getApplicationContext(), "Sí hay Sensor de Presión Atmosférica", Toast.LENGTH_LONG).show();
            textViewPresionAtm.setText("Presión Atmosférica: "+ sensorDePresionAtm.getPower());}

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=ciUniZGD4tY&feature=youtu.be&ab_channel=WorldHealthOrganization%28WHO%29");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://twitter.com/who");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        internet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.who.int/es");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }

}
