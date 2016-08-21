package com.example.alejandro.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     CheckBox jugador;
     Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jugador = (CheckBox) findViewById(R.id.seleccion_direccion_envio);

        boton = (Button)findViewById(R.id.button2);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(MainActivity.this, Ventana.class);
                startActivity(siguiente);
            }
        });
    }

    public void Mensaje(View v) {
        String texto = "Nautilus";
        Toast.makeText(this, texto, Toast.LENGTH_LONG).show();
    }

    public void NAME(View v) {
        String texto = "Estado: " + (jugador.isChecked() ? "Jugador seleccionado" : "Jugador no seleccionado");
        Toast.makeText(this, texto, Toast.LENGTH_LONG).show();
    }
}
