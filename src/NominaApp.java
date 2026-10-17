public class NominaApp {
    public static void  main(String[] args){
        Empleado emp = new Empleado(
                "1020324654",
                "Ana Rincon",
                2500000.0,
                "Mid"
        );

        System.out.println("=== DATOS INICIALES DEL EMPLEADO ===");
        System.out.println("Nombre: " + emp.getNombreCompleto());
        System.out.println("Documento: " + emp.getDocumento());
        System.out.println("Salario Bruto: $" + emp.getSalarioBasico());
        System.out.println("Deducciones (8%): $" + emp.calcularAporteSaludYPension());
        System.out.println("Salario Neto a recibir: $" + emp.calcularSalarioNeto());

        System.out.println("\n === APLICANDO AUMENTO DE SALARIO Y CAMBIO DE ROL===");
        emp.setCargo("Senior");
        emp.setSalarioBasico(4200000.0);

        System.out.println("Nuevo Cargo: " + emp.getCargo());
        System.out.println("Nuevo Salario Neto: " + emp.calcularSalarioNeto());

        System.out.println("\n===PRUEBAS DE VIOLACION DE REGLAS DE NEGOCIO===");
        emp.setSalarioBasico(500000.0);

        System.out.println("Salario restante tras intento invalido: $" + emp.getSalarioBasico());
    }
}
