public class BilleteraNequi implements MetodoPago{
    private String numeroCelular;
    private double saldoCuenta;
    private int tokenDinamicoCorrecto;

    public BilleteraNequi(String numeroCelular,
                          double saldoCuenta,
                          int tokenDinamicoCorrecto){
        this.numeroCelular=numeroCelular;
        this.saldoCuenta=saldoCuenta;
        this.tokenDinamicoCorrecto=tokenDinamicoCorrecto;

    }

    @Override
    public boolean procesarPago(double monto){
        System.out.println("Enviamdo push notificacion a Nequi" + numeroCelular + "...");
        if (monto<=saldoCuenta){
            saldoCuenta-=monto;
            return true;
        }
        return false;
    }
    public boolean validarToken(int tokenIngresado){
        return this.tokenDinamicoCorrecto==tokenIngresado;
    }
    @Override
    public void emitirRecibo(){
        System.out.println("[RECIBO NEQUI] Debito automatico" + " exitoso de la linea: " + numeroCelular);
    }
    @Override
    public String obtenerNombreMetodo(){
        return "Billetera Digital Nequi";
    }

}
