
public class Tablet extends Dispositivo {

    // Atributos propios
    private boolean tieneLapizOptico;
    private double tamanoPulgadas;

    // Constructor
    public Tablet(String serial, String marca, double precioBase,
                  boolean tieneLapizOptico, double tamanoPulgadas) {

        // Llamar al constructor de la superclase
        super(serial, marca, precioBase);

        this.tieneLapizOptico = tieneLapizOptico;
        this.tamanoPulgadas = tamanoPulgadas;
    }

    public double calcularPrecioFinal() {

        double precioFinal = precioBase;

        // Si tiene lápiz óptico, suma $150.000
        if (tieneLapizOptico) {
            precioFinal = precioBase + 150000;
        }

        return precioFinal;
    }

    @Override
    public void mostrarInfo() {

        System.out.println("===== FICHA DE LA TABLET =====");

        super.mostrarInfo();

        System.out.println("Tiene lápiz óptico: " +
                (tieneLapizOptico ? "Sí" : "No"));

        System.out.println("Tamaño: " + tamanoPulgadas + " pulgadas");
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }
}