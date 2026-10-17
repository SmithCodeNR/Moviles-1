public class MainProducto {
    public  static void main(String[] args){

        Producto p1 = new Producto();
        p1.mostrarFicha();

        Producto p2 = new Producto("PROD-001",
                "Teclado Mecanico",
                180000.00,
                15);
        p2.mostrarFicha();

        Producto p3 = new Producto("PROD-002",
                "Monitor 24 Pulgadas",
                500000.00,
                -10);
        p3.mostrarFicha();
    }
}
