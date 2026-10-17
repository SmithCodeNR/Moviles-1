public class Producto {
    private  String codigo;
    private String nombre;
    private double precioUnitario;
    private  int stock;
    // Constructor por defecto (vacio)
    public Producto(){
        this.codigo = "SIN-CODIGO";
        this.nombre = "Producto General";
        this.precioUnitario = 0.0;
        this.stock = 0;
    }
    //Constructor parametrizado
    public Producto( String codigo,
                     String nombre,
                     double precioUnitario,
                     int stock){
        this.codigo = codigo;
        this.nombre = nombre;

        if (precioUnitario >=0){
            this.precioUnitario = precioUnitario;
        }else {
            this.precioUnitario = 0.0;
        }

        if (stock >=0){
            this.stock = stock;
        }else {
            this.stock = 0;
        }
    }

    public  void mostrarFicha(){
        System.out.println("SKU: " + this.codigo + " | " + this.nombre + " Precio: $" + this.precioUnitario + " | Stock: " + this.stock + "UND.");
    }
}
