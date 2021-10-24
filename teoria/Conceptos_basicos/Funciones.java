package com.openbootcamp.teoria.Conceptos_basicos;

public class Funciones {
    public static void main(String[] args) {

        holaMundo();
        holaMundo(4);
        holaMundo("Nombre");
        //holaMundo();

        //holaMundo("Goizane");
        //holaMundo("Alvaro");

        //String hola = devolverHola();
        //System.out.println(hola);

    }

    public static void holaMundo() {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
    }

    private static void holaMundo(String name) {
        System.out.println("Hola " + name);
    }

    private static void holaMundo(Integer number) {
        System.out.println("El numero es: " + number);
    }

    private static void holaMundo(String name,  String surname) {
        System.out.println("Hola " + name);
    }

    private static String devolverHola() {
        return "Hola";
    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }

}
