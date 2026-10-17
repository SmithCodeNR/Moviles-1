public class BuscadorPlanes {
    //Buscador por ID numerico
    public void  buscadorplan(int codigoPlan){
        System.out.println("Buscando en base de datos" + "el plan con ID #" + codigoPlan + "...");
    }
    //Busqueda por Nombre/Operador
    public void buscarPlan(String nombreOperador){
        System.out.println("Filtrando planes por operador" + "comercial: '" + nombreOperador + "'...");
    }
    // Buscador por rango de precio
    public void buscarPlan(double precioMinimo,
                           double precioMaximo){
        System.out.println("Buscando planes entre $" + precioMinimo + "y $" + precioMaximo + "COP...");
    }

    //busqueda conbinada:operador y presupuesto maximo
    public void buscarPlan(String operador, double presupuestoMaximo){
        System.out.println("Buscador planes de " + operador +"con valor menor o igual a $" + presupuestoMaximo + "...");
    }
}
