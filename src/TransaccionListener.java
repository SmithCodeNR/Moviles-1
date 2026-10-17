public interface TransaccionListener {
    void  onPagoExitoso(String idTransaccion, double monto);
    void onPagoFallido(String motivo);
}
