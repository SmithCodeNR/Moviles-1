public class Dispositivo {

    private String imei;
    private String marca;
    private String modelo;
    private double precio;
    private int stock;

    public Dispositivo(String imei, String marca, String modelo,
                       double precio, int stock) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = Math.max(0.0, precio);
        this.stock = Math.max(0, stock);
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = Math.max(0.0, precio);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = Math.max(0, stock);
    }

    public void mostrarFicha() {
        System.out.println(
                "IMEI: " + imei + " | " + marca + " " + modelo
                        + " | Precio: $" + precio + " | Stock: " + stock
                        + " und."
        );
    }
}