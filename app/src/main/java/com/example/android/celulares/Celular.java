package com.example.android.celulares;

/**
 * Created by android on 26/09/2017.
 */

public class Celular {
    private String marca;
    private String sistemaoperativo;
    private String color;
    private int precio;
    public Celular(String marca, String sistemaoperativo, String color, int precio){
        this.marca = marca;
        this.sistemaoperativo = sistemaoperativo;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaoperativo() {
        return sistemaoperativo;
    }

    public void setSistemaoperativo(String sistemaoperativo) {
        this.sistemaoperativo = sistemaoperativo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void guardar () { Datos.guardar(this);}
}
