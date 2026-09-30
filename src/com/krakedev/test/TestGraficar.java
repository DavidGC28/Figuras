package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;

import com.krakedev.figuras.TrianguloRectangulo;
import com.krakedev.figuras.REctangulo;

import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;

public class TestGraficar {

    public static void main(String[] args) {
        
        Graficador graficador = new Graficador();

        
        Cuadrado c = new Cuadrado("CUADRADO", "ROJO", 1);
       
        REctangulo r = new REctangulo("RECTÁNGULO", "AZUL", 4, 5);
        TrianguloRectangulo tr = new TrianguloRectangulo("TRIÁNGULO RECTÁNGULO", "AMARILLO", 3, 4);
        Hexagono h = new Hexagono ("Hexagono", "NARANJA", 8);

     
        graficador.graficar(c);
        graficador.graficar(h);
        graficador.graficar(r);
        graficador.graficar(tr);
    }
}