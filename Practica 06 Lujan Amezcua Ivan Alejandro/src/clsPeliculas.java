//clase hija de clsEntretenimiento

public class clsPeliculas extends clsEntretenimiento{
    private String Director;
    private String Resena;

    //constructor
    public clsPeliculas(String Nombre, Double Duracion, String Tipo, String Clasificacion, String Director, String Resena){
        super(Nombre, Duracion, Tipo, Clasificacion);
        this.Director = Director;
        this.Resena = Resena;
    }

    //setters
    public void setDirector(String Director){
        this.Director = Director;
    }

    public void setResena(String Resena){
        this.Resena = Resena;
    }

    //getters
    public String getDirector(){
        return Director;
    }

    public String getResena(){
        return Resena;
    }
}

