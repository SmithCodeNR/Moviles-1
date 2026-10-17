public class DispositivoMovil {
    public String marca;
    public String modelo;
    public double precio;
    public int nivelBateria;
    public boolean encendido;

    public  void encender(){
        if (nivelBateria > 0){
            encendido = true;
            System.out.println("El"+ marca + " " + modelo + "Se Ha Encendido");

        }else {
            System.out.println("No se puede encender: Bateria agotada.");
        }
    }

    public void apagar() {
        encendido= false;
        System.out.println("El"+ marca + modelo + "Se ha apagado.");
        System.out.println();
    }
    public void cargarBateria(int porcentaje){
        if (porcentaje > 0){
            nivelBateria +=porcentaje;
            if (nivelBateria > 100){
                nivelBateria = 100;

            System.out.println("cargando... Nivel Actual de "+ marca + ":" + nivelBateria + "%");
            }
        }
    }
    public double calcularPrecioConIva(){
        double total = precio * 1.19;
        return total;
    }
    public  void mostrarDetalle(){
        System.out.println("--------------------------------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo) ;
        System.out.println("Precio base: $" + precio);
        System.out.println("Precio con IVA: $" + calcularPrecioConIva());
        System.out.println("Nivel de Bateria:" + nivelBateria + "%");
        System.out.println("Estado: " + (encendido ? "Encendido." : "Apagado"));
        System.out.println("--------------------------------");


    }
}
