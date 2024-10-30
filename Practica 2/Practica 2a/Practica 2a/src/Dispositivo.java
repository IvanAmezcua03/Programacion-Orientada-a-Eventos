public class Dispositivo {
    public String marca;
    public String sistema_Operativo;
    public String modelo;

    public Dispositivo(String marca, String sistema_Operativo, String modelo) {
        this.marca = marca;
        this.sistema_Operativo = sistema_Operativo;
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setSistema_Operativo(String sistema_Operativo) {
        this.sistema_Operativo = sistema_Operativo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getSistema_Operativo() {
        return sistema_Operativo;
    }

    public String getModelo() {
        return modelo;
    }

}