package com.openbootcamp.teoria.String_Array_List_Maps;

public class ArraysMain {

    public static void main(String[] args) {

        String nombre1 = "Nombre 1";
        String nombre2 = "Nombre 2";
        String nombre3 = "Nombre 3";
        String nombre4 = "Nombre 4";

        String[] nombres = new String[4];
        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;
        nombres[3] = nombre4;

        String[] nombres2 = new String[]{nombre1, nombre2, nombre3, nombre4};

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        int[] numeros = new int[5];
        Coche[] coches = new Coche[2];

    }
}
