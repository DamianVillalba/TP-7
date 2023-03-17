package ar.edu.utn;

public class CarritoDescuentoNegativoException extends Exception{
    private final float precio;

    public CarritoDescuentoNegativoException(float precio){
        this.precio = precio;
    }
}
