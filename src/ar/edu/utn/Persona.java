package ar.edu.utn;
import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    //constructor
    public Persona(){
    }

    public Persona(String nombrePersona, String apellidoPersona, LocalDate fechaNacimientoPersona){
        this.nombre = nombrePersona;
        this.apellido = apellidoPersona;
        this.fechaNacimiento = fechaNacimientoPersona;
    }

    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombrePersona) {
        this.nombre = nombrePersona;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimientoPersona) {
        this.fechaNacimiento = fechaNacimientoPersona;
    }

    //metodos
    public int edad(){
        if (LocalDate.now().getDayOfYear() < this.fechaNacimiento.getDayOfYear()){
            return (LocalDate.now().getYear() - this.fechaNacimiento.getYear()) - 1;
        }
        else{
            return LocalDate.now().getYear() - this.fechaNacimiento.getYear();
        }
    }
}

