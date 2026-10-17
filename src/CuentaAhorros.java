public class CuentaAhorros {
    private String numeroCuenta;
    private  String titular;
    private  double saldo;

    public  void  inicializar(String num,
                              String nombre,
                              double saldoInicial){
        numeroCuenta = num;
        titular = nombre;
        if (saldoInicial >= 0){
            saldo = saldoInicial;
        }else {
            saldo = 0;
            System.out.println("Advertencia: El saldo inicial no puede ser negativo.");
        }
    }

    public  void  consignar(double monto){
        if (monto > 0){
            saldo += monto;
            System.out.println("Consignacion Exitosa: +$" + monto + " | Nuevo Saldo: $" + saldo);
        }else {
            System.out.println("Error: El monto a consignar debe ser mayor a 0.");
        }
    }

    public  void retirar(double monto){
        if (monto <= 0 ){
            System.out.println("Error: El monto a retirar debe ser mayor a 0.");
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes. Saldo disponible: $" + saldo);
        }else {
            saldo -=monto;
            System.out.println("Retiro Exitoso: -$" + monto + "Saldo restante: $" + saldo);
        }
    }
    public  void  consultarSaldo(){
        System.out.println("Cuenta: " + numeroCuenta + " | Titular: " + titular + " | Saldo: $" + saldo );
    }
}
