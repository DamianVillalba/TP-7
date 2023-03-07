package ar.edu.utn;
import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona(){
    }

    public Persona(String nombrePersona, LocalDate fechaNacimientoPersona){
        this.nombre = nombrePersona;
        this.fechaNacimiento = fechaNacimientoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombrePersona) {
        this.nombre = nombrePersona;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimientoPersona) {
        this.fechaNacimiento = fechaNacimientoPersona;
    }
}

