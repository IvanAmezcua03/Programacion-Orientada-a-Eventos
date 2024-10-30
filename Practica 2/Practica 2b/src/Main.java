//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {

            Menu.bienvenida();
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Menu.agregarMedico();
                    break;
                case 2:
                    Menu.editarMedico();
                    break;
                case 3:
                    Menu.buscarMedico();
                    break;
                case 4:
                    Menu.mostrarMedicos();
                    break;
                case 5:
                    Menu.eliminarMedico();
                    break;
                case 6:
                    Menu.generarMedicosAleatorios();
                    System.out.println("Medicos aleatorios generados.");
                    break;
                case 7:
                    System.out.println("Gracias por usar la base de datos de Medicos");
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
        while (true);
    }
}