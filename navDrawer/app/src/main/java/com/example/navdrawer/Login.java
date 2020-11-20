package com.example.navdrawer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Login extends LinearLayout {

    private EditText textousuario;
    private EditText textopassword;
    private Button botonlogin;
    private TextView labellogin;
    private OnLoginListener onloginlistener;

    public Login(Context context){
        super(context);
        inicializar();
    }
    public Login(Context context, AttributeSet attrs) {
        super(context, attrs);
        inicializar();
    }

    private void asignarEventos(){
        botonlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onloginlistener.onLogin(textousuario.getText().toString(), textopassword.getText().toString());
            }
        });
    }

    private void inicializar(){
        //usamos el layout control_login
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li=(LayoutInflater)getContext().getSystemService(infService);
        li.inflate(R.layout.control_login, this, true);

        //obtenemos referencias
        textousuario= findViewById(R.id.editText1);
        textopassword= findViewById(R.id.editText2);
        botonlogin= findViewById(R.id.button1);
        labellogin= findViewById(R.id.textView3);

        //asociamos eventos
        asignarEventos();
    }

    public void setMensaje(String Mensaje){
        labellogin.setText(Mensaje);
    }

    public void setOnLoginListener(OnLoginListener oll){
        onloginlistener=oll;
    }
}
