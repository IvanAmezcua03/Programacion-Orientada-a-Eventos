import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class frmVentana extends JFrame implements ActionListener {
    private JPanel panel1;
    private JLabel jlbTitulo;
    private JLabel jlbNombre;
    private JTextField jtfNombre;
    private JLabel jlbVersion;
    private JTextField jtfVersion;
    private JLabel jlbDesarrollador;
    private JTextField jtfDesarrollador;
    private JLabel jlbPlataforma;
    private JTextField jtfPlataforma;
    private JButton jbtAgregar;
    private JButton jbtBuscar;
    private JButton jbtLimpiar;
    private JButton jbtSalir;


    int tamano = 10;
    int cont = 0;
    clsVentana[] canciones = new clsVentana[tamano];

    public frmVentana() {
        this.setContentPane(panel1);
        this.setSize(500, 500);
        this.setVisible(true);


        jbtAgregar.addActionListener(this);
        jbtBuscar.addActionListener(this);
        jbtSalir.addActionListener(this);
        jbtLimpiar.addActionListener(this);

        // Agregar KeyListener para validar que solo se ingresen letras en jtfNombre
        jtfNombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c)) {
                    e.consume(); // Ignorar el evento si no es una letra
                }
            }
        });

        // Agregar KeyListener para validar que solo se ingresen numeros en jtfVersion
        jtfVersion.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Ignorar el evento si no es un dígito
                }
            }
        });

        // Agregar KeyListener para validar que solo se ingresen letras en jtfDesarrollador
        jtfDesarrollador.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c)) {
                    e.consume(); // Ignorar el evento si no es una letra
                }
            }
        });

        // Agregar KeyListener para validar que solo se ingresen letras en jtfPlataforma
        jtfPlataforma.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c)) {
                    e.consume(); // Ignorar el evento si no es una letra
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle action events here
        if (e.getSource() == jbtAgregar) {
            String nombre = jtfNombre.getText();
            float version = Float.parseFloat(jtfVersion.getText());
            String desarrollador = jtfDesarrollador.getText();
            String plataforma = jtfPlataforma.getText();
            clsVentana Cancion = new clsVentana(nombre, version, desarrollador, plataforma);
            canciones[cont] = Cancion;
            cont++;
            jtfNombre.setText("");
            jtfVersion.setText("");
            jtfDesarrollador.setText("");
            jtfPlataforma.setText("");

            JOptionPane.showMessageDialog(null, "Agregado correctamente");
        } else if (e.getSource() == jbtBuscar) {
            String nombre = jtfNombre.getText();
            for (int i = 0; i < cont; i++) {
                if (canciones[i].getNombre().equals(nombre)) {
                    JOptionPane.showMessageDialog(null, "Version: " + canciones[i].getVersion() + "\nDesarrollador: " + canciones[i].getDesarrollador() + "\nPlataforma: " + canciones[i].getPlataforma());
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "No se ha enccontrado");
        } else if (e.getSource() == jbtLimpiar) {
            jtfNombre.setText("");
            jtfVersion.setText("");
            jtfDesarrollador.setText("");
            jtfPlataforma.setText("");
        } else if (e.getSource() == jbtSalir) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        // Crear una instancia de frmVentana
        frmVentana ventana = new frmVentana();

        JFrame frame = new JFrame("Application Registration System");
        /*frame.setContentPane(ventana.getContentPane()); // Configurar el contenido del frame
        frame.setSize(500, 500); // Establecer el tamaño del frame*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Configurar la operación de cierre
       // frame.setVisible(true); // Hacer visible el frame
    }
}
