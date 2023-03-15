package ar.edu.utn;

public class DescuentoPorcentajeConTope extends Descuento{
    @Override
    public float valorDescuento() {
        if (this.getValorDesc() > 50){
            return 50f;
        }
        else{
            return this.getValorDesc();
        }
    }
}
