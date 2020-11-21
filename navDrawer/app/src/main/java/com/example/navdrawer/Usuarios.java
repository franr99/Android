package com.example.navdrawer;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class Usuarios extends SQLiteOpenHelper {

    String creacion = "CREATE TABLE Usuarios (nombre TEXT, telefono TEXT, correo TEXT, contraseña TEXT)";


    public Usuarios(ControlRegistrar context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase bbdd) {
        bbdd.execSQL(creacion);


    }

    @Override
    public void onUpgrade(SQLiteDatabase bbdd, int oldVersion, int newVersion) {

        bbdd.execSQL("DROP TABLE IF EXISTS Ususarios");
        bbdd.execSQL(creacion);

    }
}
