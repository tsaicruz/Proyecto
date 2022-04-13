package ar.org.centro8.curso.java.claseproyecto.entities;

public class Vehiculo {
    private String color;
    private String marca;
    private String modelo;
    private int precio;
    private Radio radio;

    /**
     * Constructor que tiene color marca y modelo
     * 
     * @param color
     * @param marca
     * @param modelo
     */

    public Vehiculo(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Constructor que tiene color marca modelo y precio
     * 
     * @param color
     * @param marca
     * @param modelo
     * @param precio
     */

    public Vehiculo(String color, String marca, String modelo, int precio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    /**
     * Constructor que tiene color marca radio y no tiene precio
     * 
     * @param color
     * @param marca
     * @param modelo
     * @param marcaRadio // es la marca
     */
    public Vehiculo(String color, String marca, String modelo, String marcaRadio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.radio = new Radio(marcaRadio);
    }

    /**
     * Constructor que tiene color marca radio y tiene precio *
     * 
     * @param color
     * @param marca
     * @param modelo
     * @param radio
     * @param precio
     */

    public Vehiculo(String color, String marca, String modelo, int precio, String marcaRadio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.radio = new Radio(marcaRadio);
    }

    @Override
    public String toString() {
        return "Vehiculo [color=" + color + ", marca=" + marca + ", marcaRadio=" + radio + ", modelo=" + modelo
                + ", precio=" + precio + "]";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Radio getMarcaRadio() {
        return radio;
    }

    public void setMarcaRadio(String marcaRadio) {
        this.radio = new Radio(marcaRadio);

    }

}
