public class liquidadorCaja {
    public double calcularCobro(double valorBase){
        //cobro estandar: sin descuento
        System.out.println(("--> Cobro estandar sin descuento "));
        return  valorBase;
    }

    //sobrecarga 1: recibe un porcentaje de descuento (double)
    public double calculoarCobro(double valorBase,
                                 double porcentajeDescuento){
        double descuento = valorBase  * (porcentajeDescuento/100.00);
        double total = valorBase - descuento;
        System.out.println("--> Descuento por porcentaje (" + porcentajeDescuento + "%: -$)" + descuento);
        return total;
    }

    //sobrecarga 2 : recibe un valor de dinero y un cupon promocional
    // (String)
    public  double calcularCobro(double valorBase,
                                 String cuponPromocional){
        double descuento = 0.0;
        if (cuponPromocional.equalsIgnoreCase("CESDE50K")){
            descuento = 50000.00;
        } else if (cuponPromocional.equalsIgnoreCase("BIENVENIDO10K")) {
            descuento=10000.00;
        }else {
            System.out.println("->Cupon no valido.");
        }
        double total = Math.max(0,valorBase - descuento);
        System.out.println("->Descuento por cupon [" + cuponPromocional + "]: -$" + descuento);
        return total;
    }
    //sobrecarga 3: recibe porcentaje y un tope maximo de descuento
    public double calcularCobro(double valorBase,
                                double porcertajeDescuento,
                                double topeMaximoDescuento){
        double descuentoCalculado = valorBase * (porcertajeDescuento/100.0);
        if (descuentoCalculado>topeMaximoDescuento){
            descuentoCalculado=topeMaximoDescuento;
            System.out.println("->Descuento limitado al tope " + "maximo permitido: -$" + topeMaximoDescuento);
        }else {
            System.out.println("-> Descuento por porcentaje" + "aplicado: -$" + descuentoCalculado);
        }
        return  valorBase - descuentoCalculado;
    }
}
