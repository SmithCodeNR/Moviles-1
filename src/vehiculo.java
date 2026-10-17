public class vehiculo {
    private String placa;
    private String marca;
    private int cantidadPasajeros;
    private int pasajerosActuales;
    private double costoPasaje;
    private double totalRecaudado;

    public void inicializar(String Pplaca, String Pmarca, int PcantidadPasajeros, double PcostoPasaje) {
        placa = Pplaca;
        marca = Pmarca;
        cantidadPasajeros = PcantidadPasajeros;
        costoPasaje = PcostoPasaje;
        totalRecaudado = 0.0;
        pasajerosActuales = 0;
    }
    public  void  subirPasajero(int cantidad){
        if (cantidad > 0 && cantidad < cantidadPasajeros){
            pasajerosActuales = cantidadPasajeros - cantidad;
            System.out.println("capacidad de pasajeros :" + pasajerosActuales);
        } else if (cantidad > cantidadPasajeros) {
            System.out.println("la cantidad de pasajeros es superior a la capacidad disponible.");
        } else {
            System.out.println("la cantidad de pasajeros no puede ser negativa.");
        }
    }

    public  void bajarPasajero(int cantidad){
        if (cantidad <= pasajerosActuales){
            cantidadPasajeros = cantidadPasajeros + cantidad;

        }
    }
}





