package ar.org.centro8.curso.java.claseproyecto.entities;

public class Radio {

    private String marca;

    public Radio(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Radio [marca=" + marca + "]";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
