
public class Smartphone extends Dispositivo {

    // Atributos propios
    private String operador;
    private int camaraMegapixeles;

    // Constructor
    public Smartphone(String serial, String marca, double precioBase,
                      String operador, int camaraMegapixeles) {

        // Llamar al constructor de la superclase
        super(serial, marca, precioBase);

        this.operador = operador;
        this.camaraMegapixeles = camaraMegapixeles;
    }

    // aqui se crea el metodo para poder ver el precio final
    public double calcularPrecioFinal() {

        double precioFinal = precioBase;

        // Si el precio base supera $1.000.000,
        // se agrega un impuesto del 5%
        if (precioBase > 1000000) {
            precioFinal = precioBase * 1.05;
        }

        return precioFinal;
    }

    @Override
    public void mostrarInfo() {

        System.out.println("===== FICHA DEL SMARTPHONE =====");

        super.mostrarInfo();

        System.out.println("Operador: " + operador);
        System.out.println("Cámara: " + camaraMegapixeles + " MP");
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }
}