public class clsBicicleta extends clsTransporte {
    //Atributos de la clase
    private int pasajeros;
    private boolean canasta;

    //Constructor
    public clsBicicleta(String combustible, int ruedas, int pasajeros, boolean canasta) {
        super(combustible, ruedas);
        this.pasajeros = pasajeros;
        this.canasta = canasta;
    }

    //Métodos set
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setCanasta(boolean canasta) {
        this.canasta = canasta;
    }

    //Métodos get
    public int getPasajeros() {
        return pasajeros;
    }

    public boolean getCanasta() {
        return canasta;
    }
}
