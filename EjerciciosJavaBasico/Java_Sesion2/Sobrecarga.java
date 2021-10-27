package com.openbootcamp.EjerciciosJavaBasico.Java_Sesion2;

/**
 * Sobrecarga permite duplicar un método siempre y cuando tengan diferente número/tipo de parámetros.
 */

public class Sobrecarga {

    public static void main(String[] args) {

    }

    // Recibe 2 parámetro
    static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    // Recibe 3 parámetros a pesar de tener el mismo nombre
    static int suma(int numero1, int numero2, int numero3) {
        return numero1 + numero2;
    }

    // Recibe los mismos parámetros pero son de diferente tipo
    static double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }
}
