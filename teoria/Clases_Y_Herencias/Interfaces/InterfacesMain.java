package com.openbootcamp.teoria.Clases_Y_Herencias.Interfaces;

import com.openbootcamp.teoria.Clases_Y_Herencias.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        CocheService serviceClassic = new CocheServiceClassicImpl();
        CocheService serviceSport = new CocheServiceSportImpl();


        Coche coche1 = serviceClassic.crearCocheDemo();
        Coche coche2 = serviceSport.crearCocheDemo();



    }
}
