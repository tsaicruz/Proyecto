package ar.org.centro8.curso.java.claseproyecto.test;

import ar.org.centro8.curso.java.claseproyecto.entities.AutoClasico;
import ar.org.centro8.curso.java.claseproyecto.entities.AutoNuevo;
import ar.org.centro8.curso.java.claseproyecto.entities.Radio;
import ar.org.centro8.curso.java.claseproyecto.entities.Vehiculo;

public class TestVehiculo {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("-- Creamos una radio con su marca -- ");
        Radio radio = new Radio("Sony");
        System.out.println(radio);
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println(" -- Creamos un vehiculo con color , marca , modelo y precio -- ");
        Vehiculo auto1 = new Vehiculo("Rojo", "VW", "Gol", 300000);
        System.out.println(auto1);
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("-- Creamos un Auto Nuevo que siempre tiene radio y se puede cambiar de radio. --");
        AutoNuevo auto2 = new AutoNuevo("Azul", "VW", "GOL2", 20000, "Samsung");
        System.out.println(auto2);
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("--- Un Auto Clásico se puede fabricar sin radio, después se puede agregar 1 radio.. --");
        AutoClasico auto3 = new AutoClasico("Negro", "Fiat", "Uno", 30000);
        System.out.println(auto3);
        System.out.println("-------------------------------------------------------------------------------------");
        auto3.setMarcaRadio("Sony");
        System.out.println(auto3);

    }

}
