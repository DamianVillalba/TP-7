package ar.edu.utn;

public class DescuentoFijo extends Descuento{

    @Override
    public float valorDescuento() {
        return this.getValorDesc();
    }
}
