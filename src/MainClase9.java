public class MainClase9 {
    public static void main(String[] args){
        System.out.println("=== 1. PRUEBA DE SOBRECARGA DE METODOS ===");
        liquidadorCaja caja = new liquidadorCaja();
        double precioCelular = 1200000.0;

        //Invocamos las distintas variantes del mismo metodo:
        System.out.println("Total 1; $" + caja.calcularCobro(precioCelular));
        System.out.println("Total 2; $" + caja.calcularCobro(precioCelular,15.0));
        System.out.println("Total 3; $" + caja.calcularCobro(precioCelular, "CESDE50K"));
        System.out.println("Total 4; $" + caja.calcularCobro(precioCelular, 20.0, 100000.0));


        System.out.println("\n=== 2. PRUEBA DE SOBRECARGA DE BUSQUEDA ===");
        BuscadorPlanes buscador = new BuscadorPlanes();
        buscador.buscadorplan(104);
        buscador.buscarPlan("Tigo");
        buscador.buscarPlan(30000.0,75000.0);
        buscador.buscarPlan("Claro", 60000.0);

        System.out.println("\n=== 3. PRUEBA DE SOBRECARGA DE CONSTRUCTORES ===");
        CuentaUsuarioApp u1 =new CuentaUsuarioApp("maria_dev",
                "maria@gmail.com",
                "3001230000",
                250000.0);
        CuentaUsuarioApp u2 = new CuentaUsuarioApp("carlos-sistemas","carlos@gmail.com");
        CuentaUsuarioApp u3 = new CuentaUsuarioApp("Gamer2026");
        CuentaUsuarioApp u4 = new CuentaUsuarioApp();//Anonimo

        u1.mostrarPerfil();
        u2.mostrarPerfil();
        u3.mostrarPerfil();
        u4.mostrarPerfil();
    }

}