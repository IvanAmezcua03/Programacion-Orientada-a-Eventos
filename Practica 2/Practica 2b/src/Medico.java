import java.util.Scanner;

public class Medico {
    public String nombre;
    public String numeroDeCedula;
    public String edad;


    public Medico(String nombre, String numeroDeCedula, String edad) {
        this.nombre = nombre;
        this.numeroDeCedula = numeroDeCedula;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroDeCedula(String numeroDeCedula) {
        this.numeroDeCedula = numeroDeCedula;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroDeCedula() {
        return numeroDeCedula;
    }

    public String getEdad() {
        return edad;
    }
}