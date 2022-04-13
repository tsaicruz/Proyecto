package ar.org.centro8.curso.java.claseproyecto.entities;

public class AutoNuevo extends Vehiculo {

    public AutoNuevo(String color, String marca, String modelo, String marcaRadio) {
        super(color, marca, modelo, marcaRadio);
    }

    public AutoNuevo(String color, String marca, String modelo, int precio, String radio) {
        super(color, marca, modelo, precio, radio);
    }

}
