import ar.edu.utn.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona jorge = new Persona("Jorge", "Rodriguez", LocalDate.of(2002, 6, 20));
        Producto jabonPolvo = new Producto("Jabon en Polvo", "1", 40);
        Producto esponja = new Producto("Esponjas", "2", 10);
        Producto chocolate = new Producto("Chocolate", "3", 100);
        Carrito carro1 = new Carrito(jorge, LocalDate.now());
        carro1.agregarProducto(jabonPolvo);
        carro1.agregarProducto(esponja);
        carro1.agregarProducto(chocolate);
        System.out.println(carro1.costoFinal());
        // PUNTO 1
        /*
        Descuento desc;
        if (args[0].equals("fijo")){
            desc = new DescuentoFijo();
            desc.setValorDesc(300);
            System.out.println(desc.valorDescuento());
        } else if (args[0].equals("%")) {
            desc = new DescuentoPorcentaje();
            desc.setValorDesc(15);
            System.out.println(desc.valorDescuento());
        }
        else{
            System.out.println("ERROR: Ingrese \"fijo\" o \"%\" por favor.");
        }
        //PUNTO 2
        Descuento descuento2 = new DescuentoPorcentajeConTope();
        descuento2.setValorDesc(75); //supera los 50 por lo que automaticamente devuelve 50.
        System.out.println(descuento2.valorDescuento());
        descuento2.setValorDesc(30); //no supera los 50 por lo que devuelve 30.
        System.out.println(descuento2.valorDescuento());

         */
    }
}