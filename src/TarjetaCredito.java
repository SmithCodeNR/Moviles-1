public class TarjetaCredito implements  MetodoPago{
    private String numeroTarjeta;
    private double cupoDisponible;
    private int cuotas;

    public TarjetaCredito(String numeroTarjeta,
                          double cupoDisponible,
                          int cuotas){
        this.numeroTarjeta=numeroTarjeta;
        this.cupoDisponible=cupoDisponible;
        this.cuotas= Math.max(1,cuotas);
    }
    @Override
    public boolean procesarPago(double monto){
        System.out.println("Conectando franquicia (Visa/Mastercard");
        if (monto<=cupoDisponible){
            cupoDisponible -= monto;
            return true;
        }
        System.out.println("Transaccion rechazada, cupo insuficiente");
        return false;
    }
    @Override
    public  void emitirRecibo(){
        String enmascarada= "****-****-****-" + numeroTarjeta.substring(numeroTarjeta.length()-4);
        System.out.println("[RECIBO TARJETA] Pagado con: " + enmascarada + " a " + cuotas + " cuota(s)");
    }
}
