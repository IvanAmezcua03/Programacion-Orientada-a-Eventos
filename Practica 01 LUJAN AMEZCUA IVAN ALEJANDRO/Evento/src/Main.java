public class Main {
    public static void main(String[] args) {
        Evento normal = new Evento("01/01/2021", "00:00", "Local", 100, 100.00);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Registrar Evento");
            System.out.println("2 - Editar evento");
            System.out.println("3 - Mostrar evento");
            System.out.println("4 - Sair");


            int opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la Fecha:");
                    String fecha = System.console().readLine();
                    normal.setFecha(fecha);

                    System.out.println("Ingresa la Hora:");
                    String hora = System.console().readLine();
                    normal.setHora(hora);

                    System.out.println("Ingresa el Lugar");
                    String lugar = System.console().readLine();
                    normal.setLugar(lugar);

                    System.out.println("Ingresa la capacidad:");
                    int capacidad = Integer.parseInt(System.console().readLine());
                    normal.setCapacidad(capacidad);

                    System.out.println("Ingresa el precio del boleto:");
                    double precioBoleto = Double.parseDouble(System.console().readLine());
                    normal.setPrecioBoleto(precioBoleto);
                    break;
                case 2:
                    normal.editarEvento();
                    break;
                case 3:
                    normal.mostrarEvento();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}