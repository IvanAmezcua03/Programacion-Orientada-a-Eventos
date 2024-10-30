//Declarar la clase Evento
public class Evento {
    //Declarar los atributos de la clase Evento
    private String fecha;
    private String hora;
    private String lugar;
    private int capacidad;
    private double precioBoleto;
    //Declarar el constructor de la clase Evento
    public Evento(String fecha, String hora, String lugar, int capacidad, double precioBoleto) {
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.capacidad = capacidad;
        this.precioBoleto = precioBoleto;
    }
    //Declarar los metodos de la clase Evento
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void setPrecioBoleto(double precioBoleto) {
        this.precioBoleto = precioBoleto;
    }
    public void editarEvento() {
        System.out.println("Ingresa la Fecha:");
        String date = System.console().readLine();
        this.setFecha(date);

        System.out.println("Ingresa la Hora:");
        String hora = System.console().readLine();
        this.setHora(hora);

        System.out.println("Ingresa el Lugar");
        String lugar = System.console().readLine();
        this.setLugar(lugar);

        System.out.println("Ingresa la capacidad:");
        int capacidad = Integer.parseInt(System.console().readLine());
        this.setCapacidad(capacidad);

        System.out.println("Ingresa el precio del boleto:");
        double precioBoleto = Double.parseDouble(System.console().readLine());
        this.setPrecioBoleto(precioBoleto);
    }
    public void mostrarEvento() {
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Hora: " + this.hora);
        System.out.println("Lugar: " + this.lugar);
        System.out.println("Capacidad: " + this.capacidad);
        System.out.println("Precio del boleto: " + this.precioBoleto);
    }
}