public class MainBanco {
    public  static  void  main(String[] args){
        CuentaAhorros cuenta = new CuentaAhorros();
        cuenta.inicializar("CTA-2026-001","Ana Gomez", 10000);

        cuenta.consignar(100000);
        cuenta.retirar(20000);
        cuenta.retirar(500000);
        cuenta.consultarSaldo();
    }
}
