public class clsUsuario {
    private String Nombre;
    private String Contrasena;

  //constructor de la clase
    public clsUsuario(String Nombre, String Contrasena){
        this.Nombre = Nombre;
        this.Contrasena = Contrasena;
    }

    //setters
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public void setContrasena(String Contrasena){
        this.Contrasena = Contrasena;
    }

    //getters
    public String getNombre(){
        return Nombre;
    }

    public String getContrasena(){
        return Contrasena;
    }
}
