package ar.edu.utn;
import java.time.LocalDate;
public class Producto {
    private String nombre;
    private String codigo;
    private float precio;

    //constructores
    public Producto(){

    }

    public Producto(String nombreProduc, String codigoProduc, float precioProduc){
        this.nombre = nombreProduc;
        this.codigo = codigoProduc;
        this.precio = precioProduc;
    }

    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    //metodo
    public float costoFinal(int cantCoutas){
        if (cantCoutas > 6){
            return (this.precio * 1.40f);
        }
        else{
            return this.precio;
        }
    }
}
