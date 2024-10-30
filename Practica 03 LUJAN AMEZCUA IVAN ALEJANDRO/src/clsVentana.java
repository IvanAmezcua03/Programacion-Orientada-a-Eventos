

public class clsVentana {
    private String Nombre;
    private float Version;
    private String Desarrollador;
    private String Plataforma;

    public clsVentana(String Nombre, float Version, String Desarrollador, String Plataforma) {
        this.Nombre = Nombre;
        this.Version = Version;
        this.Desarrollador = Desarrollador;
        this.Plataforma = Plataforma;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setVersion(float Version) {
        this.Version = Version;
    }

    public void setDesarrollador(String Desarrollador) {
        this.Desarrollador = Desarrollador;
    }

    public void setPlataforma(String Plataforma) {
        this.Plataforma = Plataforma;
    }

    public String getNombre() {
        return Nombre;
    }

    public float getVersion() {
        return Version;
    }

    public String getDesarrollador() {
        return Desarrollador;
    }

    public String getPlataforma() {
        return Plataforma;
    }
}
