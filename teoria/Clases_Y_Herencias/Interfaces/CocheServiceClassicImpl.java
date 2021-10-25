package com.openbootcamp.teoria.Clases_Y_Herencias.Interfaces;

import com.openbootcamp.teoria.Clases_Y_Herencias.Coche;
import com.openbootcamp.teoria.Clases_Y_Herencias.CocheElectrico;
import com.openbootcamp.teoria.Clases_Y_Herencias.Interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {


    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clásico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche classic");
    }
}
