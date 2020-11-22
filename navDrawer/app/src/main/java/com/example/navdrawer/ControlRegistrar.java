package com.example.navdrawer;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class ControlRegistrar extends AppCompatActivity {

    private Button btregistrar;
    private EditText etUsuario;
    private EditText etTlf;
    private EditText etCorreo;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_registrar);

        //obtenemos referencias
        btregistrar = (Button)findViewById(R.id.bt_registrar);
        etUsuario = (EditText)findViewById(R.id.et_Rusuario);
        etTlf = (EditText)findViewById(R.id.et_telefono);
        etCorreo = (EditText)findViewById(R.id.et_correo);
        etPassword = (EditText)findViewById(R.id.et_Rpassword);

        ConexionSQLiteHelper conexion = new ConexionSQLiteHelper(this, "Usuarios", null,1);
        final SQLiteDatabase bbdd = conexion.getWritableDatabase();

        btregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues valores = new ContentValues();
                valores.put("nombre", etUsuario.getText().toString());
                valores.put("telefono", etTlf.getText().toString());
                valores.put("correo", etCorreo.getText().toString());
                valores.put("contraseña", etPassword.getText().toString());

                bbdd.insert("Usuarios",null,valores);

                etUsuario.setText(null);
                etTlf.setText(null);
                etCorreo.setText(null);
                etPassword.setText(null);

                lanzar();
            }


        });

    }

    public void lanzar(){
        Intent intent= new Intent(this,  MainActivity.class);
        startActivity(intent);
    }




}
