public class Transporte {
    private String tipo;
    private String marca;
    private String modelo;
    private String color;
    private int capacidad;
    private double precioBoleto;

    public Transporte(String tipo, String marca, String modelo, String color, int capacidad, double precioBoleto) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.capacidad = capacidad;
        this.precioBoleto = precioBoleto;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setPrecioBoleto(double precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

    public void editarTransporte() {
        System.out.println("Ingresa el tipo de transporte:");
        String tipo = System.console().readLine();
        this.setTipo(tipo);

        System.out.println("Ingresa la marca:");
        String marca = System.console().readLine();
        this.setMarca(marca);

        System.out.println("Ingresa el modelo:");
        String modelo = System.console().readLine();
        this.setModelo(modelo);

        System.out.println("Ingresa el color:");
        String color = System.console().readLine();
        this.setColor(color);

        System.out.println("Ingresa la capacidad:");
        int capacidad = Integer.parseInt(System.console().readLine());
        this.setCapacidad(capacidad);

        System.out.println("Ingresa el precio del boleto:");
        double precioBoleto = Double.parseDouble(System.console().readLine());
        this.setPrecioBoleto(precioBoleto);
    }

    public void mostrarTransporte() {
        System.out.println("Tipo de transporte: " + this.tipo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.color);
        System.out.println("Capacidad: " + this.capacidad);
        System.out.println("Precio del boleto: " + this.precioBoleto);
    }

    String getTipo() {
        return tipo;
    }

    String getMarca() {
        return marca;
    }

    String getModelo() {
        return modelo;
    }

    String getColor() {
        return color;
    }

    int getCapacidad() {
        return capacidad;
    }

    double getPrecioBoleto() {
        return precioBoleto;
    }
}
