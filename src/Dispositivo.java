
public class Dispositivo {

    // Atributos protegidos
    protected String serial;
    protected String marca;
    protected double precioBase;

    // Constructor
    public Dispositivo(String serial, String marca, double precioBase) {
        this.serial = serial;
        this.marca = marca;
        this.precioBase = precioBase;
    }

    public void mostrarInfo() {
        System.out.println("Serial: " + serial);
        System.out.println("Marca: " + marca);
        System.out.println("Precio base: $" + precioBase);
    }
}
