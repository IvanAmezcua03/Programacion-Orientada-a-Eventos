//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de frmVentana
        frmVentana ventana = new frmVentana();

        JFrame frame = new JFrame("Application Registration System");
        frame.setContentPane(ventana.getContentPane()); // Configurar el contenido del frame
        frame.setSize(500, 500); // Establecer el tamaño del frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Configurar la operación de cierre
        frame.setVisible(true); // Hacer visible el frame
    }
}