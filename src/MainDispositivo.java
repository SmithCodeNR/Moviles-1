
public class MainDispositivo {

    public static void main(String[] args) {

        // Crear un Smartphone
        Smartphone celular = new Smartphone(
                "SP001",
                "Samsung",
                1500000,
                "Claro",
                108
        );

        // Crear una Tablet
        Tablet tablet = new Tablet(
                "TB001",
                "Lenovo",
                1000000,
                true,
                11.0
        );

        // Mostrar información del Smartphone

        celular.mostrarInfo();
        //aqui se realiza el salto de linea

        System.out.println();

        // Mostrar información de la Tablet

        tablet.mostrarInfo();
    }
}