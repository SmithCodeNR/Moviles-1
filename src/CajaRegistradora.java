public class CajaRegistradora {
    private  TransaccionListener Listener;

    public  void setTransaccionListener(TransaccionListener listener){
        this.Listener=listener;
    }

    public  void cobrarServicio(MetodoPago pasarela,
                                double totalAPagar){
        System.out.println("\nIniciando cobro de $" + totalAPagar + " mediante: " + pasarela.obtenerNombreMetodo());
        boolean resultado = pasarela.procesarPago(totalAPagar);

        if (resultado){
            pasarela.emitirRecibo();
            if (Listener != null){
                String idTransaccion = "TX-" + (int)(Math.random()*1000);
                Listener.onPagoExitoso(idTransaccion, totalAPagar);
            }
        }else {
            if (Listener !=null){
                Listener.onPagoFallido("Fondo insuficiente");
            }
        }
    }

}
