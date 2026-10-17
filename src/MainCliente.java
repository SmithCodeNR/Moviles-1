public class MainCliente {

    public static void main(String[] args) {

        // Crear dos clientes
        Cliente cliente1 = new Cliente(
                "123456789",
                "Juan Perez",
                1000000
        );

        Cliente cliente2 = new Cliente(
                "987654321",
                "Maria Lopez",
                500000
        );

        // Asignar correos
        cliente1.setCorreoElectronico("juan@gmail.com");
        cliente2.setCorreoElectronico("maria@gmail.com");

        System.out.println("\n===== CLIENTE 1 =====");

        // Compra que NO supera el límite
        cliente1.realizarCompra(300000);

        // Otra compra que tampoco supera el límite
        cliente1.realizarCompra(400000);

        // Compra que supera el límite
        cliente1.realizarCompra(500000);

        // Realizar un abono
        cliente1.pagarDeuda(200000);


        System.out.println("\n===== CLIENTE 2 =====");

        // Compra que NO supera el límite
        cliente2.realizarCompra(200000);

        // Compra que supera el límite
        cliente2.realizarCompra(400000);

        // Realizar un abono
        cliente2.pagarDeuda(100000);


        // Consultar estado final del cliente 1
        System.out.println("\n===== ESTADO FINAL CLIENTE 1 =====");
        System.out.println("Cédula: " + cliente1.getCedula());
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Correo: " + cliente1.getCorreoElectronico());
        System.out.println("Cupo de crédito: $" + cliente1.getCupoCredito());
        System.out.println("Deuda actual: $" + cliente1.getDeudaActual());


        // Consultar estado final del cliente 2
        System.out.println("\n===== ESTADO FINAL CLIENTE 2 =====");
        System.out.println("Cédula: " + cliente2.getCedula());
        System.out.println("Nombre: " + cliente2.getNombre());
        System.out.println("Correo: " + cliente2.getCorreoElectronico());
        System.out.println("Cupo de crédito: $" + cliente2.getCupoCredito());
        System.out.println("Deuda actual: $" + cliente2.getDeudaActual());
    }
}