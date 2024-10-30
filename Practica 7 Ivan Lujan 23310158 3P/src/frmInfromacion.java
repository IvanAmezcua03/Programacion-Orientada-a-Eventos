import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class frmInfromacion {
    private JLabel jlbTitulo;
    private JTextArea jtaInformacion;
    private JButton jbtRegresar;
    private JPanel panel3;

    public frmInfromacion(clsLista lista) {
        JFrame frame = new JFrame("Información");
        frame.setContentPane(panel3);
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        if(!lista.estaVacia()){
            jtaInformacion.setText(lista.recorrerDestinos());
        } else{
        jtaInformacion.setText("La lista esta vacia.");}

        jbtRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
}
