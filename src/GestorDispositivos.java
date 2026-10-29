import java.util.ArrayList;

public class GestorDispositivos {

    private ArrayList<Dispositivo> inventario;

    public GestorDispositivos() {
        this.inventario = new ArrayList<>();
    }

    // Operacion 1: Crear (CREATE)
    public boolean agregarDispositivo(Dispositivo nuevo) {
        if (buscarPorImei(nuevo.getImei()) != null) {
            System.out.println("Error: Ya existe un dispositivo registrado "
                    + "con el IMEI " + nuevo.getImei());
            return false;
        }

        inventario.add(nuevo);
        System.out.println("Dispositivo agregado con exito al array");
        return true;
    }

    // Operacion 2: Buscar (READ)
    public Dispositivo buscarPorImei(String imei) {
        for (Dispositivo d : inventario) {
            if (d.getImei().equalsIgnoreCase(imei)) {
                return d;
            }
        }

        return null;
    }
    public void listarTodos(){
        if (inventario.isEmpty()){
            System.out.println("El inventario se encuentra vacio.");
            return;
        }
        System.out.println("\n---LISTADO GENERAL (" + inventario.size() +
                "REGISTROS) ---");
        for (int i = 0; i < inventario.size(); i++){
            System.out.println("#" + (i + 1) + " -> ");
            inventario.get(i).mostrarFicha();
        }
    }
    //Operacion 3: Modificar (UPDATE)
    public boolean actualizarPrecioYStock(String imei, double nuevoPrecio,
                                          int nuevoStock){
        Dispositivo d= buscarPorImei(imei);
        if (d != null){
            d.setPrecio(nuevoPrecio);
            d.setStock(nuevoStock);
            System.out.println("Datos actualizando correctamente para el IMEI" +
                    imei);
            return true;
        }
        System.out.println("Error de actualizacion: Dispositivos no encontrado");
        return false;
    }
    //Operacion 4: Eliminar (DELETE)
    public boolean eliminarDispositivo(String imei){
        for (int i = 0; i < inventario.size(); i++){
            if (inventario.get(i).getImei().equalsIgnoreCase(imei)){
                inventario.remove(i);
                System.out.println("Dispositivo con IMEI" + imei +
                        " ha sido eliminado.");
                return true;
            }
        }
        System.out.println("Error de eliminacion: No se encontro dispositivo");
        return false;
    }
    public int obtenerCantidadRegistros(){
        return inventario.size();
    }
}