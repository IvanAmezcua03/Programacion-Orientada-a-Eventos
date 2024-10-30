//Clase padre

public class clsEntretenimiento {
    private String Titulo;
    private Double Duracion;
    private String Tipo;
    private String Clasificacion;

    // constructor
    public clsEntretenimiento(String Titulo, Double Duracion, String Tipo , String Clasificacion){
        this.Titulo = Titulo;
        this.Duracion = Duracion;
        this.Tipo = Tipo;
        this.Clasificacion = Clasificacion;
    }

    //setters
    public void setNombre(String Titulo){
        this.Titulo = Titulo;
    }

    public void setDuracion(Double Duracion){
        this.Duracion = Duracion;
    }

    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }

    public void setClasificacion(String Clasificacion){
        this.Clasificacion = Clasificacion;
    }

    //getters
    public String getTitulo(){
        return Titulo;
    }

    public Double getDuracion(){
        return Duracion;
    }

    public String getTipo(){
        return Tipo;
    }

    public String getClasificacion(){
        return Clasificacion;
    }
}

