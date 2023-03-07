package ar.edu.utn;
import java.time.LocalDate;
public class Producto {
    private String nombre;
    private String descripcion;
    private LocalDate fechaAlta;
    private Integer pesoKg;
    private Double precio;

    //constructores
    public Producto(){

    }

    public Producto(String nombreProduc, String descripcionProduc, LocalDate fechaAltaProduc, Integer pesoKgProduc, Double precioProduc){
        this.nombre = nombreProduc;
        this.descripcion = descripcionProduc;
        this.fechaAlta = fechaAltaProduc;
        this.pesoKg = pesoKgProduc;
        this.precio = precioProduc;
    }

    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Integer getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(Integer pesoKg) {
        this.pesoKg = pesoKg;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
