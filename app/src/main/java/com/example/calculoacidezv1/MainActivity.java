package com.example.calculoacidezv1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText tk1=(findViewById(R.id.entrytm1));
        EditText tk2=(findViewById(R.id.entrytm2));
        EditText acd1 =(findViewById(R.id.entryacd1));
        EditText acd2=(findViewById(R.id.entryacd2));
        TextView textoresultado=findViewById(R.id.vResultado);
        Button btnCalculo=findViewById(R.id.btnCalcular);
        Button btnAcercaDe=findViewById(R.id.btnAcercaDe);


           btnCalculo.setOnClickListener(new View.OnClickListener() {
               @Override
               public boolean equals(@Nullable Object obj) {
                   return super.equals(obj);
               }

               @Override

               public void onClick(View v) {

                   Float tk1D = Float.parseFloat(tk1.getText().toString());
                   Float tk2D = Float.parseFloat(tk2.getText().toString());
                   Float ac1D = Float.parseFloat(acd1.getText().toString());
                   Float ac2D = Float.parseFloat(acd2.getText().toString());


                   Float totalTmTanques,tanque1MasAcidez,tanque2MasAcidez,sumaResultados,resultado;

                   // primer calculo. se suman los don TM de los tanques

                   totalTmTanques=tk1D+tk2D;

                   // segundo calculo. es multiplicar la medida de TM del primer tanque con la acidez correspondiente

                   tanque1MasAcidez=tk1D*ac1D;
                   tanque2MasAcidez=tk2D*ac2D;

                   // tercer calculo. se suman los resultado de del segundo calculo

                   sumaResultados=tanque1MasAcidez+tanque2MasAcidez;

                   //Cuarto calculo.Se divide el dato del tercer resultado entre el dato del primer calculo

                   resultado= sumaResultados/totalTmTanques;

                   //muestra por pantalla el resultado del calculo de la acidez final
                   textoresultado.setText("Tm final de la mezcla: "+ totalTmTanques+"Tm. La acidez final es de: "+df.format(resultado)+" AGL");



            }
        });

           btnAcercaDe.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   setContentView(R.layout.about);
               }
           });



    }






}