package com.openbootcamp.EjerciciosJavaBasico.Java_Sesion2;

public class Operadores {

    public static void main(String[] args) {

        // Aritméticos: Suma, Resta, Multiplicación, División y Resto
        int numero1 = 10;
        int numero2 = 20;
        int resultadoSuma = numero1 + numero2;
        System.out.println("Resultado suma: " + resultadoSuma);

        int resultadoResta = numero1 - numero2;
        System.out.println("Resultado resta: " + resultadoResta);

        // Comparación
        /*

         > mayor que
         < menor que
         >= mayor o igual que
         <= menor o igual que
         == igual que

         */
        boolean resultado1 = numero1 > numero2; // false
        System.out.println("Resultado booleano false: " + resultado1);

        boolean resultado2 = numero2 > numero1; // true
        System.out.println("Resultado booleano true: " + resultado2);

        // Lógicos
        /*

         and &&
         or ||

         */
        boolean resultado3 = numero1 > 5 && numero2 < 30;

        int edad = 13;
        boolean carnetJoven = edad >= 15 && edad <= 26;
        System.out.println("¿Apto para carnet joven? " + carnetJoven);

    }
}
