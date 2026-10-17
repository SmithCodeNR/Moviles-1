public class CuentaUsuarioApp {
    private String username;
    private String correo;
    private String telefono;
    private double saldoBilletera;
    private boolean activo;

    // Constructor completo
    public CuentaUsuarioApp(String username, String correo, String telefono, double saldoBilletera){
        this.username = username;
        this.correo = correo;
        this.telefono = telefono;
        this.saldoBilletera = Math.max(0.0, saldoBilletera);
        this.activo = true;
        System.out.println("[CREADO] Perfil completo para: " + this.username);
    }

    // Sobrecarga 1: constructor Basico (Sin telefono ni saldo inicial)
    public CuentaUsuarioApp(String username, String correo){
        this(username, correo, "3001230000", 0.0);
    }

    // Sobrecarga 2: constructor solo con username
    public CuentaUsuarioApp(String username){
        this(username, "anonimo@temp.com", "3001230000", 0.0);
    }

    // Sobrecarga 3: Constructor vacio (Anonimo)
    public CuentaUsuarioApp(){
        this("Invitado_" + (int)(Math.random() * 1000));
    }

    public void mostrarPerfil(){
        System.out.println("----------------------------");
        System.out.println("Usuario : " + username);
        System.out.println("Correo  : " + correo);
        System.out.println("Telefono: " + telefono);
        System.out.println("Saldo : $" + saldoBilletera);
        System.out.println("Estado : " + (activo ? "activo" : "inactivo"));
        System.out.println("___________________");
    }
}