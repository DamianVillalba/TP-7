import ar.edu.utn.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona jorge = new Persona("Jorge", "Rodriguez", LocalDate.of(2002, 6, 20));
        Producto jabonPolvo = new Producto("Jabon en Polvo", "1", 40);
        Producto esponja = new Producto("Esponjas", "2", 10);
        Producto chocolate = new Producto("Chocolate", "3", 100);
        Descuento descuentoEspecial = new DescuentoPorcentaje();
        descuentoEspecial.setValorDesc(15);
        Carrito carro1 = new Carrito(jorge, LocalDate.now());
        //Punto 1
        carro1.agregarProducto(jabonPolvo);
        carro1.agregarProducto(esponja);
        carro1.agregarProducto(chocolate);
        carro1.setDescuento(descuentoEspecial);
        //Punto 2a
        try{
            System.out.println(carro1.costoFinal());
        }catch (CarritoPrecio0Exception e){
            System.out.println("ERROR: No se puede aplicar el descuento en un carrito de costo $0.");
        }catch (CarritoDescuentoNegativoException e){
            System.out.println("ERROR: El descuento es mayor al costo del carrito.");
        }

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