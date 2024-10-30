public class tren extends Transporte {
    private int vagones;
    private int pasajeros;
    private int asientos;


    public tren(String tipo, String marca, String modelo, String color, int capacidad, double precioBoleto, int vagones, int pasajeros, int asientos) {
        super(tipo, marca, modelo, color, capacidad, precioBoleto);
        this.vagones = vagones;
        this.pasajeros = pasajeros;
        this.asientos = asientos;
    }

    public void setVagones(int vagones) {
        this.vagones = vagones;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public void editarTren() {
        this.editarTransporte();
        System.out.println("Ingresa el numero de vagones:");
        int vagones = Integer.parseInt(System.console().readLine());
        this.setVagones(vagones);

        System.out.println("Ingresa el numero de pasajeros:");
        int pasajeros = Integer.parseInt(System.console().readLine());
        this.setPasajeros(pasajeros);

        System.out.println("Ingresa el numero de asientos:");
        int asientos = Integer.parseInt(System.console().readLine());
        this.setAsientos(asientos);
    }

    public void mostrarTren() {
        this.mostrarTransporte();
        System.out.println("Numero de vagones: " + this.vagones);
        System.out.println("Numero de pasajeros: " + this.pasajeros);
        System.out.println("Numero de asientos: " + this.asientos);
    }

    int getVagones() {
        return vagones;
    }

    int getPasajeros() {
        return pasajeros;
    }

    int getAsientos() {
        return asientos;
    }
}
