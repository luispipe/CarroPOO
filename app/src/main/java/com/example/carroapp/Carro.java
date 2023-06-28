package com.example.carroapp;

public class Carro extends Vehiculo{
    //Las caracteristicas de un Objeto son los atributos de la clase
    public String color;
    public String marca;
    public String modelo;
    public int velocidad;
    public int volumen_tanque;
    public int gasolina;
    public boolean encendido;

    //El metodo principal de toda clase en POO
    // es el constructor quien se encarga de construir el objeto o instacia de clase
    // Se puede tener más de un constructor (sobrecarga de metodos)

    public Carro(){
        this.color = "Blanco";
        this.marca = "NN";
        this.modelo = "NN";
        this.velocidad = 80;
        this.volumen_tanque = 60;
        this.gasolina = 20;
        this.encendido = false;
    }

    public Carro(String color, String marca, String modelo, int velocidad, int volumen_tanque, int gasolina, boolean encendido) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.volumen_tanque = volumen_tanque;
        this.gasolina = gasolina;
        this.encendido = encendido;
    }

    //Comportamientos o metodos
    public boolean isOn(){
        return encendido;
    }
    public void on(){
        this.encendido=true;
    }
    public void of(){
        this.encendido=false;
    }
    public void llenarGasolina(){
        this.gasolina= this.volumen_tanque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){

        return "Carro- Color: "+this.color+
                ", Marca: "+this.marca+
                ", Velocidad: "+this.velocidad+
                ", Gasolina: "+this.gasolina+
                ", Encendido: "+ this.encendido;

    }

    @Override
    public String getMarca() {
        return this.marca;
    }
}
