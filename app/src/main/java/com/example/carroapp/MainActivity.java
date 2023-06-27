package com.example.carroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Crear un objeto
        Carro miPrimerCarro=
        new Carro("Blue","Mazda","Mazda3",70,65,30,true);
        miPrimerCarro.of();
        miPrimerCarro.llenarGasolina();
        miPrimerCarro.setColor("Negro");
        Log.i("Carro 1",miPrimerCarro.toString());
        Carro carroDos= new Carro();
        Log.i("Carro 2",carroDos.toString());

        Camioneta camioneta1= new Camioneta("Verde","Toyota","Hilux",40,90,50,true,true);
        Log.i("Camioneta",camioneta1.toString());

    }
}