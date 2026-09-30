package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.REctangulo;

public class TestPerimetro {

    public static void main(String[] args) {
        
        Cuadrado c = new Cuadrado("CUADRADO", "ROJO", 5);
        
        
        REctangulo r = new REctangulo("RECTÁNGULO", "AZUL", 4, 3);

       
        System.out.println("El perímetro del " + c.getNombre() + " es: " + c.calcularPerimetro()); 
        

        System.out.println("El perímetro del " + r.getNombre() + " es: " + r.calcularPerimetro()); 
       
    }
}