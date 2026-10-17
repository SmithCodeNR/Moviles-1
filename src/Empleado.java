public class Empleado {
    private  String documento;
    private String nombreCompleto;
    private double salarioBasico;
    private String cargo;

    public Empleado(String documento,
                    String nombreCompleto,
                    double salarioBasico,
                    String cargo){
        this.documento = documento;
        this.nombreCompleto = nombreCompleto;
        setSalarioBasico(salarioBasico);
        setCargo(cargo);
    }

    public String getDocumento(){
        return this.documento;
    }

    public String getNombreCompleto(){
        return this.nombreCompleto;
    }

    public double getSalarioBasico(){ return  this.salarioBasico;}
    public  String getCargo(){return this.cargo;}

    public  void setNombreCompleto(String nombreCompleto){
        if (nombreCompleto != null && !nombreCompleto.trim().isEmpty()){
            this.nombreCompleto = nombreCompleto;
        }else {
            System.out.println("Error: El nombre no puede estar vacio. ");
        }
    }

    public  void setSalarioBasico(double nuevoSalario){
        final double SALARIO_MINIMO = 1730000.0;
        if (nuevoSalario >= SALARIO_MINIMO){
            this.salarioBasico = nuevoSalario;
        }else {
            System.out.println("Error: El salario no puede " + "ser inferior al minimo legal ($" + SALARIO_MINIMO + ").");
            this.salarioBasico = SALARIO_MINIMO;
        }
    }

    public void setCargo(String cargo){
        if (cargo.equalsIgnoreCase("Junior") || cargo.equalsIgnoreCase("Mid") || cargo.equalsIgnoreCase("Senior")){
            this.cargo = cargo;
        }else {
            this.cargo = "Junior";
            System.out.println("Cargo no reconocido. Se asigna ´Junior´ ");
        }
    }

    public double calcularAporteSaludYPension(){
        return this.salarioBasico * 0.08;
    }

    public  double calcularSalarioNeto(){
        return this.salarioBasico - calcularAporteSaludYPension();
    }

}
