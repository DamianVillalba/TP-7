package ar.edu.utn;

public class CarritoPrecio0Exception extends Exception{
    private final float precio;

    //Constructor
    public CarritoPrecio0Exception(float precio){
        this.precio = precio;
    }
}
