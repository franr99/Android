package com.example.navdrawer;



import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    private Login cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

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
    }

    private void login() {
        Intent intent = new Intent(this, Principal.class);
        startActivity(intent);
    }


}