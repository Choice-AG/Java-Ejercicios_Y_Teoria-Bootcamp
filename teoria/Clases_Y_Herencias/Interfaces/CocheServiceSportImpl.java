package com.openbootcamp.teoria.Clases_Y_Herencias.Interfaces;

import com.openbootcamp.teoria.Clases_Y_Herencias.Coche;
import com.openbootcamp.teoria.Clases_Y_Herencias.Interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {


    @Override
    public Coche crearCocheDemo() {
        System.out.println("Crear coche de carreras");
        return null;
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche Sport");
    }
}
