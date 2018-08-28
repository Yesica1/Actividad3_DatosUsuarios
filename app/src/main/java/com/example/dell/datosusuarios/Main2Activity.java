package com.example.dell.datosusuarios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*Textviews que se utilizarán para imprimir los datos que el usuario ingreso*/

        TextView datosnombre = (TextView) findViewById(R.id.datosnombre);
        TextView datosapellido = (TextView) findViewById(R.id.datosapellido);
        TextView datosedad = (TextView) findViewById(R.id.datosedad);

        Bundle extras = getIntent().getExtras();

        Usuario usuario = extras.getParcelable("usuario");


        /*se utiliza la clave establecida del objeto para mandar a llamar los datos almacenaddos en las variables
        * establecidas, además de que se puede adjuntar o agregar datos, tal es el caso como Años*/

        datosnombre.setText(usuario.getNombres());
        datosapellido.setText(usuario.getApellidos());
        datosedad.setText(String.valueOf(usuario.getEdad()) + " Años");
    }
}
