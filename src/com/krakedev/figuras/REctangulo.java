package com.krakedev.figuras;

public class REctangulo extends Figura {
    
    private int base;
    private int altura;

  
    public REctangulo(String nombre, String color, int base, int altura) {
        super(nombre, color); 
        this.base = base;     
        this.altura = altura; 
    }

  
    public int calcularPerimetro() {
        return 2 * base + 2 * altura;
    }

  
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}