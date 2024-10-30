import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class frmTransporte extends JFrame implements ActionListener {
    private JPanel panel1;
    private JLabel jlbTitulo;
    private JTextField jtfCombustible;
    private JTextField jtfRuedas;
    private JTextField jtfPasajeros;
    private JTextField jtfCanasta;
    private JButton jbtRegistrar;
    private JButton jbtBuscar;
    private JButton jbtLimpiar;
    private JButton jbtPrimerRegistro;
    private JLabel jlbCombustible;
    private JLabel jlbRuedas;
    private JLabel jlbPasajeros;
    private JLabel jlbCansata;
    private JLabel jlbDinamic;

    // arreglo de objetos de la clase clsTransporte
    int tamano = 15;
    int cont = 0;
    clsTransporte[] transporte = new clsTransporte[tamano];

    // Constructor de la clase
    public frmTransporte() {
        this.setContentPane(panel1);
        this.setSize(500, 500);
        this.setVisible(true);

        jbtRegistrar.addActionListener(this);
        jbtBuscar.addActionListener(this);
        jbtLimpiar.addActionListener(this);
        jbtPrimerRegistro.addActionListener(this);

        // Agregar KeyListener para validar que solo se ingresen letras en jtfCombustible
        jtfCombustible.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent event) {
                char c = event.getKeyChar();
                if (!Character.isLetter(c)) {
                    event.consume(); // Ignorar el evento si no es una letra
                }
            }
        });

        // Agregar KeyListener para validar que solo se ingresen numeros en jtfRuedas
        jtfRuedas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent event) {
                char c = event.getKeyChar();
                if (!Character.isDigit(c)) {
                    event.consume(); // Ignorar el evento si no es un numero
                }
            }
        });

        // Agregar KeyListener para validar que solo se ingresen numeros en jtfPasajeros
        jtfPasajeros.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent event) {
                char c = event.getKeyChar();
                if (!Character.isDigit(c)) {
                    event.consume(); // Ignorar el evento si no es un numero
                }
            }
        });

        // Agregar KeyListener para validar que solo se ingresen letras en jtfCanasta
        jtfCanasta.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent event) {
                char c = event.getKeyChar();
                if (!Character.isLetter(c)) {
                    event.consume(); // Ignorar el evento si no es una letra
                }
            }
        });

        //Crear 3 objetos de la clase clsBicicleta
        clsBicicleta bicicleta1 = new clsBicicleta("Pedal", 2, 1, true);
        clsBicicleta bicicleta2 = new clsBicicleta("Pedal", 2, 2, false);
        clsBicicleta bicicleta3 = new clsBicicleta("Pedal", 2, 1, true);

        //Agregar los objetos al arreglo
        transporte[0] = bicicleta1;
        transporte[1] = bicicleta2;
        transporte[2] = bicicleta3;

        //Mostrar el primer registro
        if (transporte[0] instanceof clsBicicleta) {
            clsBicicleta bicicleta = (clsBicicleta) transporte[0];
            jtfCombustible.setText(bicicleta.getCombustible());
            jtfRuedas.setText(String.valueOf(bicicleta.getRuedas()));
            jtfPasajeros.setText(String.valueOf(bicicleta.getPasajeros()));
            jtfCanasta.setText(String.valueOf(bicicleta.getCanasta()));
        }
    }

    //Metodo para manejar los eventos de los botones
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == jbtRegistrar) {
            registrarTransporte();
        } else if (event.getSource() == jbtBuscar) {
            buscarTransporte();
        } else if (event.getSource() == jbtLimpiar) {
            limpiarCampos();
        } else if (event.getSource() == jbtPrimerRegistro) {
            mostrarPrimerRegistro();
        }
    }

    //Metodo para agregar un objeto de la clase clsTransporte al arreglo transporte
    public void registrarTransporte() {
        if (cont < tamano) {
            transporte[cont++] = new clsBicicleta(jtfCombustible.getText(), Integer.parseInt(jtfRuedas.getText()), Integer.parseInt(jtfPasajeros.getText()), Boolean.parseBoolean(jtfCanasta.getText()));
            jlbDinamic.setText("Registro exitoso");
        } else {
            jlbDinamic.setText("No se pueden agregar mas registros");
        }
    }

    //Metodo para buscar un objeto de la clase clsTransporte en el arreglo transporte
    public void buscarTransporte() {
        try {
            int pasajeros = Integer.parseInt(jtfPasajeros.getText());
            boolean encontrado = false;
            for (int i = 0; i < cont; i++) {
                if (transporte[i] instanceof clsBicicleta) {
                    clsBicicleta bicicleta = (clsBicicleta) transporte[i];
                    if (bicicleta.getPasajeros() == pasajeros) {
                        jtfCombustible.setText(bicicleta.getCombustible());
                        jtfRuedas.setText(String.valueOf(bicicleta.getRuedas()));
                        jtfPasajeros.setText(String.valueOf(bicicleta.getPasajeros()));
                        jtfCanasta.setText(String.valueOf(bicicleta.getCanasta()));
                        jlbDinamic.setText("Transporte encontrado");
                        encontrado = true;
                        break;
                    }
                }
            }
            if (!encontrado) {
                jlbDinamic.setText("No se encontro el transporte con el numero de pasajeros especifico");
            }
        } catch (NumberFormatException e) {
            jlbDinamic.setText("Por favor ingrese un número válido de pasajeros");
        }
    }

    //Metodo para limpiar los campos de texto
    public void limpiarCampos() {
        jtfCombustible.setText("");
        jtfRuedas.setText("");
        jtfPasajeros.setText("");
        jtfCanasta.setText("");
        jlbDinamic.setText("Campos limpiados");
    }

    //Metodo para mostrar el primer registro del arreglo transporte
    public void mostrarPrimerRegistro() {
        if (transporte[0] instanceof clsBicicleta) {
            clsBicicleta bicicleta = (clsBicicleta) transporte[0];
            jtfCombustible.setText(bicicleta.getCombustible());
            jtfRuedas.setText(String.valueOf(bicicleta.getRuedas()));
            jtfPasajeros.setText(String.valueOf(bicicleta.getPasajeros()));
            jtfCanasta.setText(String.valueOf(bicicleta.getCanasta()));
            jlbDinamic.setText("Prier registro mostrado");
        }
    }
}