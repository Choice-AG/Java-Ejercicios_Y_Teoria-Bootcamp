package com.openbootcamp.teoria.String_Array_List_Maps;

import java.util.Locale;

public class StringMain {

    public static void main(String[] args) {
        // La clase String

        /*
            length()
            startsWith("")
            endsWith("")
            indexOf("")
            subsString(1,5)
            trim()
            equals()
            compareTo
         */

        String mensaje = "  Hola mundo  "; // Creación de String llamado mensaje
        System.out.println(mensaje.length());

        String mensajeMAY = mensaje.toUpperCase(); // Creamos la variable mensajeMAY a la que le diremos que es mensaje pero con mayúsculas
        System.out.println(mensajeMAY);
        System.out.println(mensajeMAY.trim()); // Quita los espacios que sobran

        //mensajeMAY = mensajeMAY.trim(); // Le decimos que es igual que el mismo pero sin los espacios

        String otro = "HOLA MUNDO"; // Nueva String con nombre "otro"
        if (mensajeMAY.equals(otro)) { // Comprobamos que mensajeMAY sea igual a otro con equals
            System.out.println("Verdadero!!");
        }else{
            System.out.println("No son iguales");
        }

        if (mensajeMAY.equalsIgnoreCase(otro)) { // Comprobamos que mensajeMAY sea igual a otro con equals ignorando mayúsculas y minúsculas
            System.out.println("Verdadero!!");
        }
    }
}
