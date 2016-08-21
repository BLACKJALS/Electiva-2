package com.example.alejandro.facepotato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageView sombrero;
    ImageView cejas;
    ImageView bigote;
    ImageView nariz;
    ImageView brazos;
    ImageView ojos;
    ImageView gafas;
    ImageView boca;
    ImageView orejas;
    ImageView zapatos;



    CheckBox  hat;
    CheckBox  eyeBrowns;
    CheckBox  mustache;
    CheckBox  nose;
    CheckBox  arms;
    CheckBox  eyes;
    CheckBox  glasses;
    CheckBox  mouth;
    CheckBox  ears;
    CheckBox  shoes;




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            hat       = (CheckBox)findViewById(R.id.hat);
            eyeBrowns = (CheckBox)findViewById(R.id.eyeBrowns);
            mustache  = (CheckBox)findViewById(R.id.mustache);
            nose      = (CheckBox)findViewById(R.id.nose);
            arms      = (CheckBox)findViewById(R.id.arms);
            eyes      = (CheckBox)findViewById(R.id.eyes);
            glasses   = (CheckBox)findViewById(R.id.glasses);
            mouth     = (CheckBox)findViewById(R.id.mouth);
            ears      = (CheckBox)findViewById(R.id.ears);
            shoes     = (CheckBox)findViewById(R.id.Zapatos);




            sombrero = (ImageView)findViewById(R.id.Sombrero);
            cejas    = (ImageView)findViewById(R.id.Cejas);
            bigote   = (ImageView)findViewById(R.id.bigote);
            nariz    = (ImageView)findViewById(R.id.Nariz);
            brazos   = (ImageView)findViewById(R.id.Brazos);
            ojos     = (ImageView)findViewById(R.id.Ojos);
            gafas    = (ImageView)findViewById(R.id.Gafas);
            boca     = (ImageView)findViewById(R.id.Boca);
            orejas   = (ImageView)findViewById(R.id.Orejas);
            zapatos  = (ImageView)findViewById(R.id.Pies);

        }


        public void seleccionarPartes(View v) {

            if(hat.isChecked()){
                sombrero.setVisibility(View.VISIBLE);
            }else{
                sombrero.setVisibility(View.INVISIBLE);
            }
            if(eyeBrowns.isChecked()){
                cejas.setVisibility(View.VISIBLE);
            }else{
                cejas.setVisibility(View.INVISIBLE);
            }
            if(mustache.isChecked()){
                bigote.setVisibility(View.VISIBLE);
            }else{
                bigote.setVisibility(View.INVISIBLE);
            }
            if(nose.isChecked()){
                nariz.setVisibility(View.VISIBLE);
            }else{
                nariz.setVisibility(View.INVISIBLE);
            }
            if(arms.isChecked()){
                brazos.setVisibility(View.VISIBLE);
            }else{
                brazos.setVisibility(View.INVISIBLE);
            }
            if(eyes.isChecked()){
                ojos.setVisibility(View.VISIBLE);
            }else{
                ojos.setVisibility(View.INVISIBLE);
            }
            if(glasses.isChecked()){
                gafas.setVisibility(View.VISIBLE);
            }else{
                gafas.setVisibility(View.INVISIBLE);
            }
            if(mouth.isChecked()){
                boca.setVisibility(View.VISIBLE);
            }else{
                boca.setVisibility(View.INVISIBLE);
            }
            if(ears.isChecked()){
                orejas.setVisibility(View.VISIBLE);
            }else{
                orejas.setVisibility(View.INVISIBLE);
            }
            if(shoes.isChecked()){
                zapatos.setVisibility(View.VISIBLE);
            }else{
                zapatos.setVisibility(View.INVISIBLE);
            }
        }

}
