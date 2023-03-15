package ar.edu.utn;

import java.time.LocalDate;

public class Carrito {
    private Persona persona;
    private Producto producto1;
    private Producto producto2;
    private Producto producto3;
    private LocalDate fechaCompra;
    private Descuento descuento;

    //constructor
    public Carrito(){

    }

    public Carrito(Persona personaNueva, Producto productoNuevo1, Producto productoNuevo2, Producto productoNuevo3, LocalDate fechaCompraNueva){
        this.persona = personaNueva;
        this.producto1 = productoNuevo1;
        this.producto2 = productoNuevo2;
        this.producto3 = productoNuevo3;
        this.fechaCompra = fechaCompraNueva;
    }

    //get y set

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Producto getProducto1() {
        return producto1;
    }

    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }

    public Producto getProducto2() {
        return producto2;
    }

    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
    }

    public Producto getProducto3() {
        return producto3;
    }

    public void setProducto3(Producto producto3) {
        this.producto3 = producto3;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    //metodos
    public float costoFinal(){
        return this.producto1.getPrecio() + this.producto2.getPrecio() + this.producto3.getPrecio();
    }
}
