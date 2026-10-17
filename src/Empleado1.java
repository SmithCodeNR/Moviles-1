public class Empleado1 extends Persona {
    private  double salarioBasico;
    private String cargo;

    public  Empleado1(
            String documento, String nombreCompleto,
            String correo,double salarioBasico, String cargo
    ){
        super(documento,nombreCompleto,correo);
        this.salarioBasico = salarioBasico;
        this.cargo = cargo;
    }

    public  double getSalarioBasico(){
        return  salarioBasico;
    }
    public void setSalarioBasico(double salarioBasico){
        this.salarioBasico = salarioBasico;
    }

    public String getCargo (){
        return cargo;
    }

    public  double CalcularBonoDesempeno(){
        return this.salarioBasico * 0.10;
    }

    @Override
    public void mostrarFicha(){
        super.mostrarFicha();
        System.out.println("   ->[Empleaod] Cargo: " + cargo +
                " | Salario: $" + salarioBasico +
                " | Bono: $" + CalcularBonoDesempeno()
        );
    }
}

