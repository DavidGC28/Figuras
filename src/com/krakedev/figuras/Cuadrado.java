package com.krakedev.figuras;

public class Cuadrado extends Figura {

    private int lado;
    
   
    public Cuadrado(String nombre, String color, int lado) {
        super(nombre, color);
        this.lado = lado;
    }

   
    public int calcularPerimetro() {
        return 4 * lado;
    }


    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}