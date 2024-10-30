import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class frmIngreso extends JFrame implements ActionListener {
    private JPanel panel1;
    private JLabel jlbTitulo;
    private JTextField jtfUsuario;
    private JLabel jlbUsuario;
    private JLabel jlbContrasena;
    private JPasswordField jpfContrasena;
    private JButton jbtIngresar;
    private JLabel jlbDinamic;

    // Arreglo de objetos de la clase clsUsuario
    int tamano = 20;
    clsUsuario[] usuarios = new clsUsuario[tamano];

    // Constructor de la clase
    public frmIngreso() {
        this.setContentPane(panel1);
        this.setSize(300, 300);
        this.setVisible(true);

        // Inicializar usuarios por defecto
        usuarios[0] = new clsUsuario("admin", "admin");
        usuarios[1] = new clsUsuario("luis", "luis");
        usuarios[2] = new clsUsuario("ivan", "ivan");
        usuarios[3] = new clsUsuario("Manuelito", "potkeik");
        usuarios[4] = new clsUsuario("test2", "test2");

        // Validar que solo se ingresen letras en jtfUsuario
        jtfUsuario.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c)) {
                    e.consume(); // Ignorar el evento si no es una letra
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        // Agregar ActionListener al botón de ingresar
        jbtIngresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usuario = jtfUsuario.getText();
        String contrasena = new String(jpfContrasena.getPassword());

        boolean encontrado = false;
        for (clsUsuario u : usuarios) {
            if (u != null && u.getNombre().equals(usuario) && u.getContrasena().equals(contrasena)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            jlbDinamic.setText("Bienvenido");
            new frmRegistro();
            this.dispose();
        } else {
            jlbDinamic.setText("Datos incorrectos, favor de intentarlo nuevamente");
        }
    }

}