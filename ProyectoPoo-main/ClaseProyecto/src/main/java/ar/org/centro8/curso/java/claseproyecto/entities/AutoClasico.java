package ar.org.centro8.curso.java.claseproyecto.entities;

public class AutoClasico extends Vehiculo {

    public AutoClasico(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    public AutoClasico(String color, String marca, String modelo, int precio) {
        super(color, marca, modelo, precio);
    }

    public AutoClasico(String color, String marca, String modelo, int precio, String marcaRadio) {
        super(color, marca, modelo, precio, marcaRadio);
    }

    public AutoClasico(String color, String marca, String modelo, String marcaRadio) {
        super(color, marca, modelo, marcaRadio);
    }

    
}
