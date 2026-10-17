public interface MetodoPago {
    boolean procesarPago( double monto);
    void emitirRecibo();
    String obtenerNombreMetodo();
}
