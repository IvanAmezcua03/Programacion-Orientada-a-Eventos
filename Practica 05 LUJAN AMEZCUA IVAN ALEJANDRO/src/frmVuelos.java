import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class frmVuelos extends JFrame implements ActionListener {
    private JPanel Panel1;
    private JLabel jlbTitulo;
    private JTextField jtfAerolinea;
    private JTextField jtfFolio;
    private JTextField jtfOrigen;
    private JTextField jtfDestino;
    private JTextField jtfCosto;
    private JButton jbtAnterior;
    private JButton jbtSiguiente;
    private JButton jbtAgregar;
    private JButton jbtBuscar;
    private JButton jbtEliminar;
    private JButton jbtLimpiar;
    private JLabel jlbAerolinea;
    private JLabel jlbFolio;
    private JLabel jlbOrigen;
    private JLabel jlbDestino;
    private JLabel jlbCosto;
    private JLabel jlbDinamic;

    // arreglo de objetos de la clase clsVuelos
    int tamano = 20;
    int cont = 0;
    int currentIndex = 0;
    clsVuelos[] vuelos = new clsVuelos[tamano];

    // Constructor de la clase
    public frmVuelos() {
        this.setContentPane(Panel1);
        this.setSize(500, 500);
        this.setVisible(true);

        jbtAgregar.addActionListener(this);
        jbtBuscar.addActionListener(this);
        jbtEliminar.addActionListener(this);
        jbtLimpiar.addActionListener(this);
        jbtAnterior.addActionListener(this);
        jbtSiguiente.addActionListener(this);

        // Agregar KeyListener para validar que solo se ingresen letras en jtfAerolinea
        jtfAerolinea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c)) {
                    e.consume(); // Ignorar el evento si no es una letra
                }
            }
        });

        // Agregar KeyListener para validar que solo se ingresen numeros en jtfFolio
        jtfFolio.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Ignorar el evento si no es un dígito
                }
            }
        });

        // Agregar KeyListener para validar que solo se ingresen letras en jtfOrigen
        jtfOrigen.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c)) {
                    e.consume(); // Ignorar el evento si no es una letra
                }
            }
        });

        // Agregar KeyListener para validar que solo se ingresen letras en jtfDestino
        jtfDestino.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c)) {
                    e.consume(); // Ignorar el evento si no es una letra
                }
            }
        });

        // Agregar KeyListener para validar que solo se ingresen numeros en jtfCosto
        jtfCosto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Ignorar el evento si no es un dígito
                }
            }
        });

        // Crear 3 objetos de la clase clsVuelos
        vuelos[cont++] = new clsVuelos("Aeromexico", 1, "CDMX", "GDL", 2000);
        vuelos[cont++] = new clsVuelos("Volaris", 2, "CDMX", "MTY", 1500);
        vuelos[cont++] = new clsVuelos("Interjet", 3, "CDMX", "CUN", 3000);

        // Mostrar el primer vuelo
        mostrarVuelo(0);
    }

    // Metodo para manejar los eventos de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtAgregar) {
            agregarVuelo();
        } else if (e.getSource() == jbtBuscar) {
            buscarVuelo();
        } else if (e.getSource() == jbtEliminar) {
            eliminarVuelo();
        } else if (e.getSource() == jbtLimpiar) {
            limpiarCampos();
        } else if (e.getSource() == jbtAnterior) {
            anteriorVuelo();
        } else if (e.getSource() == jbtSiguiente) {
            siguienteVuelo();
        }
    }

    // Metodo para agregar un vuelo
    public void agregarVuelo() {
        // Validar que los campos no esten vacios
        if (jtfAerolinea.getText().equals("") || jtfFolio.getText().equals("") || jtfOrigen.getText().equals("") || jtfDestino.getText().equals("") || jtfCosto.getText().equals("")) {
            jlbDinamic.setText("Por favor, llena todos los campos");
        } else {
            // Validar que el folio no se repita
            boolean repetido = false;
            for (int i = 0; i < cont; i++) {
                if (vuelos[i].getFolio() == Integer.parseInt(jtfFolio.getText())) {
                    repetido = true;
                }
            }
            if (repetido) {
                jlbDinamic.setText("El folio ya existe");
            } else {
                // Agregar el vuelo al arreglo
                vuelos[cont] = new clsVuelos(jtfAerolinea.getText(), Integer.parseInt(jtfFolio.getText()), jtfOrigen.getText(), jtfDestino.getText(), Integer.parseInt(jtfCosto.getText()));
                cont++;
                jlbDinamic.setText("Vuelo agregado correctamente");
                limpiarCampos();
            }
        }
    }

    // Metodo para buscar un vuelo por aerolínea
    public void buscarVuelo() {
        // Validar que el campo aerolínea no esté vacío
        if (jtfAerolinea.getText().equals("")) {
            jlbDinamic.setText("Por favor, ingresa la aerolínea");
        } else {
            // Buscar el vuelo en el arreglo
            boolean encontrado = false;
            for (int i = 0; i < cont; i++) {
                if (vuelos[i].getAerolinea().equalsIgnoreCase(jtfAerolinea.getText())) {
                    jtfFolio.setText(String.valueOf(vuelos[i].getFolio()));
                    jtfOrigen.setText(vuelos[i].getOrigen());
                    jtfDestino.setText(vuelos[i].getDestino());
                    jtfCosto.setText(String.valueOf(vuelos[i].getCosto()));
                    encontrado = true;
                    break; // Salir del bucle una vez encontrado
                }
            }
            if (!encontrado) {
                jlbDinamic.setText("Vuelo no encontrado");
            }
        }
    }

    // Metodo para eliminar un vuelo
    public void eliminarVuelo() {
        // Validar que el campo folio no este vacio
        if (jtfFolio.getText().equals("")) {
            jlbDinamic.setText("Por favor, ingresa el folio");
        } else {
            // Buscar el vuelo en el arreglo
            boolean eliminado = false;
            for (int i = 0; i < cont; i++) {
                if (vuelos[i].getFolio() == Integer.parseInt(jtfFolio.getText())) {
                    for (int j = i; j < cont - 1; j++) {
                        vuelos[j] = vuelos[j + 1];
                    }
                    cont--;
                    jlbDinamic.setText("Vuelo eliminado correctamente");
                    limpiarCampos();
                    eliminado = true;
                }
            }
            if (!eliminado) {
                jlbDinamic.setText("Vuelo no encontrado");
            }
        }
    }

    // Metodo para limpiar los campos
    public void limpiarCampos() {
        jtfAerolinea.setText("");
        jtfFolio.setText("");
        jtfOrigen.setText("");
        jtfDestino.setText("");
        jtfCosto.setText("");
    }

    // Metodo para mostrar el vuelo anterior
    public void anteriorVuelo() {
        if (currentIndex > 0) {
            currentIndex--;
            mostrarVuelo(currentIndex);
        } else {
            jlbDinamic.setText("No hay vuelos anteriores");
        }
    }

    // Metodo para mostrar el vuelo siguiente
    public void siguienteVuelo() {
        if (currentIndex < cont - 1) {
            currentIndex++;
            mostrarVuelo(currentIndex);
        } else {
            jlbDinamic.setText("No hay vuelos siguientes");
        }
    }

    // Metodo para mostrar un vuelo en los campos de texto
    private void mostrarVuelo(int index) {
        jtfAerolinea.setText(vuelos[index].getAerolinea());
        jtfFolio.setText(String.valueOf(vuelos[index].getFolio()));
        jtfOrigen.setText(vuelos[index].getOrigen());
        jtfDestino.setText(vuelos[index].getDestino());
        jtfCosto.setText(String.valueOf(vuelos[index].getCosto()));
    }
}