public class Persona {
    protected String documento;
    protected  String nombreCompleto;
    protected String correo;

    public Persona(String documento, String nombreCompleto, String correo){
        this.documento = documento;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
    }

    public String getDocumento(){
        return documento;
    }

    public String getNombreCompleto(){
        return nombreCompleto;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(){
        this.correo = correo;
    }

    public  void  mostrarFicha(){
        System.out.println("Doc: "+ documento + " | Nombre: " + nombreCompleto + " | Email: " + correo);
    }
}
