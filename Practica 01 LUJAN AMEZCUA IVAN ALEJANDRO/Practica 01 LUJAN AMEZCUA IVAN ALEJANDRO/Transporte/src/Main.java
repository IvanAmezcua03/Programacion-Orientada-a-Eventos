//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        tren tren1 = new tren("Tren", "Trenes", "Trenesito", "Azul", 100, 100.00, 10, 100, 100);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Registrar Tren");
            System.out.println("2 - Editar Tren");
            System.out.println("3 - Mostrar Tren");
            System.out.println("4 - Sair");

            int opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el tipo de transporte:");
                    String tipo = System.console().readLine();
                    tren1.setTipo(tipo);

                    System.out.println("Ingresa la marca:");
                    String marca = System.console().readLine();
                    tren1.setMarca(marca);

                    System.out.println("Ingresa el modelo:");
                    String modelo = System.console().readLine();
                    tren1.setModelo(modelo);

                    System.out.println("Ingresa el color:");
                    String color = System.console().readLine();
                    tren1.setColor(color);

                    System.out.println("Ingresa la capacidad:");
                    int capacidad = Integer.parseInt(System.console().readLine());
                    tren1.setCapacidad(capacidad);

                    System.out.println("Ingresa el precio del boleto:");
                    double precioBoleto = Double.parseDouble(System.console().readLine());
                    tren1.setPrecioBoleto(precioBoleto);

                    System.out.println("Ingresa el numero de vagones:");
                    int vagones = Integer.parseInt(System.console().readLine());
                    tren1.setVagones(vagones);

                    System.out.println("Ingresa el numero de pasajeros:");
                    int pasajeros = Integer.parseInt(System.console().readLine());
                    tren1.setPasajeros(pasajeros);

                    System.out.println("Ingresa el numero de asientos:");
                    int asientos = Integer.parseInt(System.console().readLine());
                    tren1.setAsientos(asientos);
                    break;
                case 2:
                    tren1.editarTren();
                    break;
                case 3:
                    tren1.mostrarTren();
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