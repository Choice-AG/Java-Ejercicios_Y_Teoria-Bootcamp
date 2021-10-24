package com.openbootcamp.teoria.Conceptos_basicos;

public class Tipos {


    public static void main(String[] args) {

        // tipo - identificador = numero/texto;
        // tipo identificador;
        // identificador = 30

        // enteros (numéricos)
        byte number1 = 1; // 1 byte
        short number2 = 2; // 2 byte
        int number3 = 3; // 4 bytes - de los más utilizados
        long number4 = 4L; // 8 bytes - de los más utilizados

        // punto flotante (decimales)
        float decimal1 = 4.9f;
        double decimal2 = 9.99d;

        // carácter (1 sola letra entre '')
        char character1 = 'a';

        // booleanos
        boolean verdaderos = true;
        boolean falsos = false;

        // cadenas de texto (varias letras) tipo clase
        String nombre = "Goizane";
        String apellido = "Olañeta";

        // tipos envoltorio
        Integer numero = null;
        Long numero2 = 2L;

        // las clases y string empiezan con Mayúscula siempre
        // las variables empiezan con minúscula y la segunda con mayúscula -> numeroTelefono
    }
}
