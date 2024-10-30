public class clsVuelos {
private String Aerolinea;
private int Folio;
private String Origen;
private String Destino;
private float Costo;

// Constructor
    public clsVuelos(String Aerolinea, int folio, String Origen, String Destino, float Costo) {
        this.Aerolinea = Aerolinea;
        this.Folio = folio;
        this.Origen = Origen;
        this.Destino = Destino;
        this.Costo = Costo;
    }

    // Métodos set
    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    public void setFolio(int Folio) {
        this.Folio = Folio;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public void setCosto(float Costo) {
        this.Costo = Costo;
    }

    // Métodos get

    public String getAerolinea() {
        return Aerolinea;
    }

    public int getFolio() {
        return Folio;
    }

    public String getOrigen() {
        return Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public float getCosto() {
        return Costo;
    }

}
