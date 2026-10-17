public class Cliente {

    // Atributos privados
    private String cedula;
    private String nombre;
    private String correoElectronico;
    private double cupoCredito;
    private double deudaActual;

    // Constructor
    public Cliente(String cedula, String nombre, double cupoCredito) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cupoCredito = cupoCredito;
        this.deudaActual = 0.0;
    }

    // Getters
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public double getCupoCredito() {
        return cupoCredito;
    }

    public double getDeudaActual() {
        return deudaActual;
    }

    // Setter para correo electrónico
    public void setCorreoElectronico(String correoElectronico) {

        if (correoElectronico.contains("@")) {
            this.correoElectronico = correoElectronico;
            System.out.println("Correo electrónico actualizado correctamente.");
        } else {
            System.out.println("Error: el correo debe contener el símbolo @.");
        }
    }

    // Método para realizar una compra
    public void realizarCompra(double valorCompra) {

        if (deudaActual + valorCompra <= cupoCredito) {
            deudaActual += valorCompra;

            System.out.println("Compra aprobada por: $" + valorCompra);
            System.out.println("Deuda actual: $" + deudaActual);

        } else {
            System.out.println("Compra rechazada.");
            System.out.println("Motivo: cupo de crédito excedido.");
        }
    }

    // Método para pagar deuda
    public void pagarDeuda(double valorAbono) {

        if (valorAbono <= deudaActual) {
            deudaActual -= valorAbono;

            System.out.println("Abono realizado: $" + valorAbono);
            System.out.println("Deuda restante: $" + deudaActual);

        } else {
            System.out.println("El abono no puede ser mayor a la deuda actual.");
        }
    }
}