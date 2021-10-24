package com.openbootcamp.teoria.For_If_Else_Switch;

public class WhileLoop {

    public static void main(String[] args) {

        boolean check = true;

        int count = 0;
        while(count < 10){
            count++; // condición
            if (count == 6)
                //continue; //salta el valor 6 y continua a la siguiente iteración
                break; //rompe el flujo de ejecución del bucle y sale del bucle

            System.out.println(count + " Hola mundo");

        }
        System.out.println("fin");
    }
}
