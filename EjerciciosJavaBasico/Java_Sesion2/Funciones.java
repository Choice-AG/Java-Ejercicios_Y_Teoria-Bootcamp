package com.openbootcamp.EjerciciosJavaBasico.Java_Sesion2;

public class Funciones {

    public static void main(String[] args) {

        // Opción 1: función sin parámetros y sin tipo de retorno (no devuelve nada - VOID)
        showMenu();

        // Opción 2: función sin parámetros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        double price = getPrice();

        // Opción 3: Función con parámetros y sin tipo de retorno
        imprimirSaludo("OpenBootcamp");

        // Opción 4: Función con parámetros y con tipo de retorno
        String nombre = "Goizane";
        String apellido = "Olañeta";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        // Con números
        int numero1 = 50;
        int numero2 = 200;
        int resultadoSuma = suma(numero1, numero2);
        System.out.println(resultadoSuma);

    }

    static double getPrice() {
        return 100.99;
    }


    static void showMenu() {
        System.out.println("Bienvenidos al E-commerce de zapatillas:");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("3 - Salir");
    }

    static String getMenu() {
        return "Bienvenidos al E-commerce de zapatillas: \n 1 - Ver zapatillas";
    }

    static void imprimirSaludo(String nombre) {
        System.out.println("Buenas tardes " + nombre);
    }

    static String obtenerSaludo(String nombre, String apellido) {
        return "Buenas tardes " + nombre + " " + apellido;
    }

    static int suma(int numero1, int numero2) {
        return + numero1 + numero2;
    }
}
