package com.example.dell.datosusuarios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText nombres = (EditText) findViewById(R.id.ET_nombres);
        final EditText apellidos = (EditText) findViewById(R.id.ET_apellidos);
        final EditText edad = (EditText) findViewById(R.id.ET_edad);
        Button agregardatosBoton = (Button) findViewById(R.id.BT_agregar);



        agregardatosBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            /*Validacion de los datos ingresados, al faltar ingresar algun dato, este mensaje se mostrará con el objetivo de que se ingrese el dato deseado
            * y que no ocasione problemas al crashearse.*/
                if (nombres.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Favor de ingresar el nombre", Toast.LENGTH_LONG).show();
                    return;
                }

                if (apellidos.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Favor de ingresar el apellido", Toast.LENGTH_LONG).show();
                    return;
                }

                if (edad.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Favor de ingresar la edad", Toast.LENGTH_LONG).show();
                    return;
                }


                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                /*Se establecen los datos datos declarados al inicio en base a la utilizacion del objeto Usuario creado, conviertiendo la edad int en String para poderlo
                * situar aqui, en base al constructor realizado en el objeto Usuario. */
                Usuario usuario = new Usuario(nombres.getText().toString(), apellidos.getText().toString(), Integer.parseInt(edad.getText().toString()));


                intent.putExtra("usuario", usuario);

                startActivity(intent);
            }
        });


    }
}
