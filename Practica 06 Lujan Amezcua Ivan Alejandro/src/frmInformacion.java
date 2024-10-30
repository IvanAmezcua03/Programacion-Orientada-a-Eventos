// src/frmInformacion.java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmInformacion extends JFrame implements ActionListener {
    private JPanel Panel3;
    private JLabel jlbInformacion;
    private JLabel jlbTitulo;
    private JTextField jtfTitulo;
    private JLabel jlbDuracion;
    private JTextField jtfDuracion;
    private JLabel jlbTipo;
    private JRadioButton jrbTerror;
    private JRadioButton jrbAccion;
    private JRadioButton jrbRomance;
    private JLabel jlbDirector;
    private JTextField jtfDirector;
    private JLabel jlbClasificacion;
    private JCheckBox jcbInfantil;
    private JCheckBox jcbParental;
    private JCheckBox jcbAdultos;
    private JLabel jlbResena;
    private JTextPane jtaResena;
    private JButton jbtAnterior;
    private JButton jbtSiguiente;
    private JButton jbtRegresar;

    private int currentIndex = 0;
    private clsPeliculas[] peliculas;
    private int cont;

    public frmInformacion(clsPeliculas[] peliculas, int cont) {
        this.peliculas = peliculas;
        this.cont = cont;

        this.setContentPane(Panel3);
        this.setSize(500, 500);
        this.setVisible(true);

        jbtAnterior.addActionListener(this);
        jbtSiguiente.addActionListener(this);
        jbtRegresar.addActionListener(this);

        displayPelicula(currentIndex);
    }

    private void displayPelicula(int index) {
        if (index >= 0 && index < cont) {
            clsPeliculas pelicula = peliculas[index];
            jtfTitulo.setText(pelicula.getTitulo());
            jtfDuracion.setText(String.valueOf(pelicula.getDuracion()));
            jtfDirector.setText(pelicula.getDirector());
            jtaResena.setText(pelicula.getResena());

            jrbTerror.setSelected(pelicula.getTipo().equals("Terror"));
            jrbAccion.setSelected(pelicula.getTipo().equals("Accion"));
            jrbRomance.setSelected(pelicula.getTipo().equals("Romance"));

            jcbInfantil.setSelected(pelicula.getClasificacion().equals("Infantil"));
            jcbParental.setSelected(pelicula.getClasificacion().equals("Parental"));
            jcbAdultos.setSelected(pelicula.getClasificacion().equals("Adultos"));
        } else {
            jtfTitulo.setText("No hay más películas");
            jtfDuracion.setText("No hay más películas");
            jtfDirector.setText("No hay más películas");
            jtaResena.setText("No hay más películas");

            jrbTerror.setSelected(false);
            jrbAccion.setSelected(false);
            jrbRomance.setSelected(false);

            jcbInfantil.setSelected(false);
            jcbParental.setSelected(false);
            jcbAdultos.setSelected(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtAnterior) {
            if (currentIndex > 0) {
                currentIndex--;
                displayPelicula(currentIndex);
            } else {
                displayPelicula(-1); // No hay más películas a la izquierda
            }
        } else if (e.getSource() == jbtSiguiente) {
            if (currentIndex < cont - 1) {
                currentIndex++;
                displayPelicula(currentIndex);
            } else {
                displayPelicula(cont); // No hay más películas a la derecha
            }
        } else if (e.getSource() == jbtRegresar) {
            this.dispose();
            new frmRegistro(peliculas, cont);
        }
    }
}