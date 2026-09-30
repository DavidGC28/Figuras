package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura {
    
   
    private double catetoA;
    private double catetoB;
    private double hipotenusa;

    
    public TrianguloRectangulo(String nombre, String color, double catetoA, double catetoB) {
        super(nombre, color); 
        this.catetoA = catetoA;
        this.catetoB = catetoB;
     
        this.hipotenusa = Math.hypot(catetoA, catetoB); 
    }

    
    @Override
    public int calcularPerimetro() {
        return (int) (catetoA + catetoB + hipotenusa);
    }

    
    @Override
    public double calcularArea() {
        return (catetoA * catetoB) / 2.0;
    }

   
    public double getCatetoA() {
        return catetoA;
    }

    public void setCatetoA(double catetoA) {
        this.catetoA = catetoA;
        this.hipotenusa = Math.hypot(this.catetoA, this.catetoB); 
    }

    public double getCatetoB() {
        return catetoB;
    }

    public void setCatetoB(double catetoB) {
        this.catetoB = catetoB;
        this.hipotenusa = Math.hypot(this.catetoA, this.catetoB); 
    }

    public double getHipotenusa() {
        return hipotenusa;
    }
}