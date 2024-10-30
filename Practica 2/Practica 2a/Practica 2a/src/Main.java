import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        do {
            Menu.bienvenida();
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Menu.agregarDispositivo();
                    break;
                case 2:
                    Menu.editarDispositivo();
                    break;
                case 3:
                    Menu.buscarDispositivo();
                    break;
                case 4:
                    Menu.mostrarDispositivos();
                    break;
                case 5:
                    Menu.generarDispositivosAleatorios();
                    System.out.println("Dispositivos aleatorios generados.");
                    break;
                case 6:
                    System.out.println("Gracias por usar el sistema de dispositivos");
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        } while (true);
    }
}