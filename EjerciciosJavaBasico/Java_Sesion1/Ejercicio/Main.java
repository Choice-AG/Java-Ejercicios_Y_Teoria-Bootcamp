package com.openbootcamp.EjerciciosJavaBasico.Java_Sesion1.Ejercicio;

/**
 * Crear un proyecto Java desde cero.
 * Crear un paquete.
 * Dentro del paquete crear una clase.
 * Dentro de la clase crear un método main.
 * Imprimir todos los tipos de datos vistos.
 */

public class Main {

    public static void main(String[] args) {

        // Variables de tipo número entero
        byte varByte = 1;
        short varShort = 2;
        int varInt = 3;
        long varLong = 4;

        // Imprimir las variables enteras
        System.out.println("Variables tipo número entero");
        System.out.println("Variable byte: " + varByte);
        System.out.println("Variable short: " + varShort);
        System.out.println("Variable int: " + varInt);
        System.out.println("Variable long: " + varLong);


        // Variables de tipo número decimal
        float varFloat = 1.0f;
        double varDouble = 2.0d;

        // Imprimir las variables decimales
        System.out.println("Variables tipo número decimal");
        System.out.println("Variable float: " + varFloat);
        System.out.println("Variable double: " + varDouble);


        // Variables tipo booleanas
        boolean varTrue = true;
        boolean varFalse = false;

        // Imprimir las variables booleanas
        System.out.println("Variables tipo booleanas");
        System.out.println("Variable booleana true: " + varTrue);
        System.out.println("Variable booleana false: " + varFalse);


        // Variables tipo texto
        char varChar = 'a';
        String varString = "HolaMundo";

        //Imprimir las variables texto
        System.out.println("Variables tipo texto");
        System.out.println("Variable char: " + varChar);
        System.out.println("Variable String: " + varString);
    }
}
