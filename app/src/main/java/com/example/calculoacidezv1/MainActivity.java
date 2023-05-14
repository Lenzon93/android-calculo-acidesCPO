package com.example.calculoacidezv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
        btnCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tk1D = Double.parseDouble(tk1.getText().toString());
                Double tk2D = Double.parseDouble(tk2.getText().toString());
                Double ac1D = Double.parseDouble(acd1.getText().toString());
                Double ac2D = Double.parseDouble(acd2.getText().toString());


                Double totalTmTanques,tanque1MasAcidez,tanque2MasAcidez,sumaResultados,resultado;

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
                textoresultado.setText("Con un tanque de : "+tk1D+" TM, que tiene una acidez de : "+ac1D+" AGL. " +
                        "Si le sumamos las "+ tk2D+ " TMS del segundo Tanque que tiene la acidez de "+
                        ac2D+" AGl . Nos da el resultado de :"+resultado+" AGL");


            }
        });

    }






}