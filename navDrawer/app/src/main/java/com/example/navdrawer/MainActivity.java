package com.example.navdrawer;


import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Login cl;
    private TextView tv;
    private EditText textousuario;
    private EditText textopassword;
    private Button botonlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        final ConexionSQLiteHelper conexion  = new ConexionSQLiteHelper(this,"Usuarios",null,1);
        final SQLiteDatabase bbdd = conexion.getReadableDatabase();
        textousuario= findViewById(R.id.et_usuario);
        tv = (TextView)findViewById(R.id.tv_registrarse);
        cl = (Login) findViewById(R.id.Cntrollogin);
        cl.setOnLoginListener(new OnLoginListener(){
            @Override
            public void onLogin(String usuario, String password) {

                Cursor c = bbdd.rawQuery("SELECT nombre FROM Usuarios WHERE nombre ='" + usuario + "' AND contraseña='" + password + "'", null);

                try {
                    if (c != null) {
                        c.moveToFirst();
                        do {
                            String nombre = c.getString(c.getColumnIndex("nombre"));

                        } while (c.moveToNext());
                    }

                    //Cerramos el cursor y la conexion con la base de datos
                    c.close();
                    //bbdd.close();
                    login();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Usuario o contraseña incorrectos.", Toast.LENGTH_LONG).show();
                }
            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrar();

            }
        });
    }

    private void login() {
        Intent intent = new Intent(this, Principal.class);
        startActivity(intent);
    }

    private void registrar(){
        Intent intent = new Intent(this, ControlRegistrar.class);
        startActivity(intent);
    }


}