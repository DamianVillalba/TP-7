package ar.edu.utn;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private Persona persona;
    private List<Producto> productos;
    private LocalDate fechaCompra;
    private Descuento descuento;

    //constructor
    public Carrito(){
        this.productos = new ArrayList<Producto>();
    }

    public Carrito(Persona personaNueva, LocalDate fechaCompraNueva){
        this.persona = personaNueva;
        this.fechaCompra = fechaCompraNueva;
        this.productos = new ArrayList<Producto>();
    }

    //get y set

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
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
    //PUNTO 1
    public void agregarProducto(Producto productoNuevo){
        this.productos.add(productoNuevo);
    }

    public void eliminarProducto(Producto productoEliminar){
        this.productos.remove(productoEliminar);
    }

    public List<Producto> getProductos(){
        //encapsulamos
        List<Producto> listaProductos = new ArrayList<Producto>();
        listaProductos.addAll(this.productos);
        return listaProductos;
    }

    private float costoSinDescuentos() throws CarritoPrecio0Exception{
        float suma = 0;
        for (Producto productoActual : productos){
            suma+= productoActual.getPrecio();
        }
        if (suma == 0){
            throw new CarritoPrecio0Exception(suma);
        }
        return suma;
    }

    //PUNTO 2B
    public float costoFinal() throws CarritoPrecio0Exception, CarritoDescuentoNegativoException{
        float resultado = costoFinalSegunDescuento(costoSinDescuentos(), this.descuento);
        if (resultado < 0){
            throw new CarritoDescuentoNegativoException(resultado);
        }
        return resultado;
    }

    private float costoFinalSegunDescuento(float resultado, Descuento descuentoCarrito){
        if (descuentoCarrito.getClass() == DescuentoFijo.class){
            return resultado - descuentoCarrito.getValorDesc();
        }
        else{
            float porcentajeAFijo = (resultado * descuentoCarrito.getValorDesc()) / 100;
            return resultado - porcentajeAFijo;
        }
    }
}
