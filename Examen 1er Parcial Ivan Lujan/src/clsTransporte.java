//Clase padre
public class clsTransporte {
    //Atributos de la clase
    private String combustible;
    private int ruedas;

    //Constructor
    public clsTransporte(String combustible, int ruedas) {
        this.combustible = combustible;
        this.ruedas = ruedas;
    }

    //Métodos set
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    //Métodos get
    public String getCombustible() {
        return combustible;
    }

    public int getRuedas() {
        return ruedas;
    }
}
