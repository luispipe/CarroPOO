package com.example.carroapp;

public class Camioneta extends Carro{
    public  boolean traccion4x4;

    public Camioneta(String color, String marca, String modelo, int velocidad, int volumen_tanque, int gasolina, boolean encendido, boolean traccion4x4) {
        super(color, marca, modelo, velocidad, volumen_tanque, gasolina, encendido);
        this.traccion4x4 = traccion4x4;
    }

    public Camioneta(boolean traccion4x4) {
        this.traccion4x4 = traccion4x4;
    }


}
