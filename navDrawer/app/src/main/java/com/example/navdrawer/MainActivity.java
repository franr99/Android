package com.example.navdrawer;



import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Login cl;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        tv = (TextView)findViewById(R.id.tv_registrarse);
        cl = (Login) findViewById(R.id.Cntrollogin);
        cl.setOnLoginListener(new OnLoginListener(){
            @Override
            public void onLogin(String usuario, String password){
                //se valida si coinciden los usuarios
                if (usuario.equals("UCAM") && password.equals("1234")){

                    cl.setMensaje("Acceso concedido");
                    login();
                }
                else
                    cl.setMensaje("No tienes acceso");
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
        Intent intent = new Intent(this, Registrar.class);
        startActivity(intent);
    }


}