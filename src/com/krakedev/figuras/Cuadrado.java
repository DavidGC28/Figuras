package com.krakedev.figuras;

public class Cuadrado extends Figura {

    private int lado;
    
   
    public Cuadrado(String nombre, String color, int lado) {
        super(nombre, color);
        this.lado = lado;
    }

@Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

@Override
public double calcularArea() {
    return lado * lado;
}


    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}