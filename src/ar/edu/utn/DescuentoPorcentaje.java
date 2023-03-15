package ar.edu.utn;

public class DescuentoPorcentaje extends Descuento{
    @Override
    public float valorDescuento() {
        return this.getValorDesc();
    }
}
