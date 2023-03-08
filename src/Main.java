import ar.edu.utn.Persona;
import ar.edu.utn.Producto;
import ar.edu.utn.Carrito;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona jorge = new Persona("Jorge", "Rodriguez", LocalDate.of(2002, 6, 20));
        Producto jabonPolvo = new Producto("Jabon en Polvo", "1", 40);
        Producto esponja = new Producto("Esponjas", "2", 10);
        Producto chocolate = new Producto("Chocolate", "3", 100);
        Carrito carro1 = new Carrito(jorge, jabonPolvo, esponja, chocolate, LocalDate.now());
        System.out.println(carro1.costoFinal());
    }
}