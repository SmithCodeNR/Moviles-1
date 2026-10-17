import java.awt.event.ActionListener;

public class MainHerencia {
    public  static void  main(String[]args){
        System.out.println("===SISTEMA DE GESTION===");

        Empleado1 emp=new Empleado1(
                "10102020",
                "laura Restrepo",
                "Laura@gmail.com",
                2000000.0,
                "Tecnico");

        Cliente1 cli1 = new Cliente1(
                "90908080",
                "Andres Cepeda",
                "andres@gmail.com",
                "VIP",
                5000000);

        System.out.println("-- FICHA EMPLEO -- ");
        emp.mostrarFicha();

        System.out.println("-- FICHA CLIENTE --");
        cli1.mostrarFicha();
        cli1.aumentarCupo(1000000.0);
    }
}
