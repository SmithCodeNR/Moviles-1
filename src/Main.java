public class Main {
    public static void main(String[]args){
        DispositivoMovil cel1 = new DispositivoMovil();
        cel1.marca = "Samsung";
        cel1.modelo = "Galaxy S26 Ultra";
        cel1.precio = 4500000;
        cel1.nivelBateria = -50;
        cel1.encendido = false;

        DispositivoMovil cel2 = new DispositivoMovil();
        cel2.marca = "Xiaomi";
        cel2.modelo = "17 Ultra";
        cel2.precio = 5500000;
        cel2.nivelBateria = 0;
        cel2.encendido = false;

        System.out.println("=== Pruebas del Dispositivo 1 ===");

        cel1.encender();
        cel1.cargarBateria(30);
        cel1.mostrarDetalle();

        System.out.println("\n=== Pruebas del Dispositivo 2 ===");

        cel2.encender();
        cel2.cargarBateria(15);
        cel2.encender();
        cel2.mostrarDetalle();


    }
}