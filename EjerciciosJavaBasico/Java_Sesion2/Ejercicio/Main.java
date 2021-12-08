package com.openbootcamp.EjerciciosJavaBasico.Java_Sesion2.Ejercicio;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * Crear una función que reciba un precio y devuelva el precio con el IVA incluido
 */

public class Main {

    public static <String> void main(String[] args) {


        double precio = 67.4;
        double IVA = precio / 100 * 21;
        double resultado = getPriceIVA(precio + IVA);
        System.out.println(resultado);

    }

    static double getPriceIVA(double precioConIVA) {
        return precioConIVA;
    }
}
