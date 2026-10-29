public class Transacciones {

    public static void main(String[] args) {

        System.out.println("=== PASARELA DE PAGOS MULTIPLATAFORMA ===");

        CajaRegistradora caja = new CajaRegistradora();

        caja.setTransaccionListener(new TransaccionListener() {

            @Override
            public void onPagoExitoso(String idTransaccion, double monto) {
                System.out.println(">>> [EVENTO NOTIFICADO]");
                System.out.println("Venta exitosa ID: " + idTransaccion);
                System.out.println("Monto pagado: $" + monto);
            }

        });

    }
}