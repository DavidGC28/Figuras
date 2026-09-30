package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Triangulo;
import com.krakedev.figuras.REctangulo;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;

public class TestGraficar {

    public static void main(String[] args) {
        
        Graficador graficador = new Graficador();

        Figura f = new Figura("FIGURA GENÉRICA", "GRIS");
        Cuadrado c = new Cuadrado("CUADRADO", "ROJO", 1);
        Triangulo t = new Triangulo("TRIÁNGULO", "VERDE");
        REctangulo r = new REctangulo("RECTÁNGULO", "AZUL", 4, 5);

        graficador.graficar(f);
        graficador.graficar(c);
        graficador.graficar(t);
        graficador.graficar(r);
    }
}