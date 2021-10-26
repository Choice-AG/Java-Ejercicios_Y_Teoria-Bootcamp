package com.openbootcamp.teoria.String_Array_List_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("12345678A", "Nombre Apellido 1");
        personas.put("12345678H", "Nombre Apellido 2");
        personas.put("12345678S", "Nombre Apellido 3");

        System.out.println(personas);

        for(String key : personas.keySet()){ // Imprime solo las llaves
            System.out.println(key);
        }

        for(String value : personas.values()){ // Imprime solo los valores
            System.out.println(value);
        }

        for(Map.Entry<String, String> pair : personas.entrySet()){ // Nos imprime tanto la clave como el valor con getKey() y gey Value()
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
