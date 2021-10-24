package com.openbootcamp.teoria.For_If_Else_Switch;

public class SwitchCase {

    public static void main(String[] args) {

        String weather = "2343242";

        switch (weather) {

            case "sunny":
                System.out.println("El timepo es soleado");
                break;
            case "cloudy":
                System.out.println("El tiempo esta nublado");
                break;
            default:
                System.out.println("No se ha podido identificar el clima");
                break;
        }

    }
}
