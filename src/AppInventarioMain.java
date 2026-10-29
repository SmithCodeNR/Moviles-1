import java.util.Scanner;
public class AppInventarioMain {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        GestorDispositivos gestor = new GestorDispositivos();
        int opcion = 0;

        do {
            System.out.println("\n==================");
            System.out.println(" GESTOR DE INVENTARIO MOVIL ");
            System.out.println("=====================");
            System.out.println("1. Registrar nuevo dispositivo");
            System.out.println("2. consultar dispositivo por imei");
            System.out.println("3. Listar todo el inventario");
            System.out.println("4. Actualizar precio y stock");
            System.out.println("5. Eliminar dispositivo");
            System.out.println("6. salir");
            System.out.println("Seleccione una opcion:");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("\n---REGISTRO DE DISPOSITIVO ---");
                    System.out.println("IMEI: ");
                    String imei = sc.nextLine();

                    System.out.println("Marca: ");
                    String marca = sc.nextLine();

                    System.out.println("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.println("Precio: $");
                    double precio = sc.nextDouble();

                    System.out.println("Stock inicial:");
                    int stock = sc.nextInt();

                    Dispositivo nuevo = new Dispositivo(imei, marca, modelo, precio, stock);
                    gestor.agregarDispositivo(nuevo);
                    break;
                case 2:
                    System.out.println("\nIngrese el IMEI a buscar: ");
                    String imeiBuscar = sc.nextLine();
                    Dispositivo encontrado = gestor.buscarPorImei(imeiBuscar);
                    if (encontrado != null){
                        System.out.println("Dispositivo encontrado");
                        encontrado.mostrarFicha();
                    }else{
                        System.out.println("Dispositivo no registrado.");
                    }
                    break;
                case 3:
                    gestor.listarTodos();
                    break;
                case 4:
                    System.out.println("\nIngrese el dispositivo a modificar");
                    String imeiModificar = sc.nextLine();
                    System.out.println("Nuevo Precio: $");
                    double nPrecio = sc.nextDouble();
                    System.out.println("Nuevo stock");
                    int nStock = sc.nextInt();

                    gestor.actualizarPrecioYStock(imeiModificar, nPrecio, nStock);
                    break;
                case 5:
                    System.out.println("\nIngrese el imei del dispositivo a eliminar:");
                    String imeiEliminar = sc.nextLine();
                    gestor.eliminarDispositivo(imeiEliminar);
                    break;
                case 6:
                    System.out.println("Cerrando sesion en el sistema, hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }

        }while (opcion != 6);
        sc.close();
    }
}