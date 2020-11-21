package com.example.navdrawer;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;


public class ControlRegistrar extends LinearLayout {

    private Button btregistrar;
    private EditText etUsuario;
    private EditText etTlf;
    private EditText etCorreo;
    private EditText etPassword;


    public ControlRegistrar(Context context){
        super(context);
        inicializar();
    }


    public ControlRegistrar(Context context, AttributeSet attrs) {
        super(context, attrs);
        inicializar();
    }

    private void inicializar() {

        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li=(LayoutInflater)getContext().getSystemService(infService);
        li.inflate(R.layout.control_registrar, this, true);

        //obtenemos referencias
        btregistrar = (Button)findViewById(R.id.bt_registrar);
        etUsuario = (EditText)findViewById(R.id.et_Rusuario);
        etTlf = (EditText)findViewById(R.id.et_telefono);
        etCorreo = (EditText)findViewById(R.id.et_correo);
        etPassword = (EditText)findViewById(R.id.et_Rpassword);

        Usuarios usuario = new Usuarios(this,"Usuarios",null,1);
        final SQLiteDatabase bbdd = usuario.getWritableDatabase();

        btregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues valores = new ContentValues();
                valores.put("nombre", etUsuario.getText().toString());
                valores.put("nombre", etTlf.getText().toString());
                valores.put("nombre", etCorreo.getText().toString());
                valores.put("nombre", etPassword.getText().toString());

                bbdd.insert("Usuarios",null,valores);

                etUsuario.setText(null);
                etTlf.setText(null);
                etCorreo.setText(null);
                etPassword.setText(null);
            }


        });


    }


}
