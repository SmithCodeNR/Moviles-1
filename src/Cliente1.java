public class Cliente1 extends Persona{
    private String categoria;
    private double cupoCredito;

    public Cliente1(String documento,
                    String nombreCompleto,
                    String correo,
                    String categoria,
                    double cupoCredito){
        super(documento, nombreCompleto, correo);
        this.categoria = categoria;
        this.cupoCredito = cupoCredito;
    }

    public String getCategoria(){
        return categoria;
    }

    public double getCupoCredito(){
        return cupoCredito;
    }

    public  void aumentarCupo(double incremento){
        if (incremento >  0){
            this.cupoCredito = incremento;
            System.out.println("Cupo aumentado con Exito. Nuevo Cupo: $"+ this.cupoCredito);
        }
    }

    @Override
    public void  mostrarFicha(){
        super.mostrarFicha();
        System.out.println("   ->[Cliente] Categoria: "+ categoria +
                " | Cupo Credito: $" + cupoCredito);
    }
}
