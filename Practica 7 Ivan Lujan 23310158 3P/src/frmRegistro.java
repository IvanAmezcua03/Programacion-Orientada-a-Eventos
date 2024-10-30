import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;
import java.util.Objects;

public class frmRegistro {
    private JPanel panel2;
    private JLabel jlbDinamic;
    private JLabel jlbDestinos;
    private JLabel jlbHabitacion;
    private JComboBox jcbDestinos;
    private JLabel jlbDias;
    private JScrollBar jsbDias;
    private JLabel jlbDiasEstancia;
    private JLabel jlbPago;
    private JRadioButton jrbUnPago;
    private JRadioButton jrbSeisMeses;
    private JButton jbtRegistrar;
    private JButton jbtLimpiar;
    private JButton jbtInformacion;
    private JButton jbtRegresar;
    private JScrollPane jspDestinos;
    private JList jlsDestinos;

    private clsLista lista;
    private String destino;
    private String habitacion;

    private static final float[] COSTOS_ADICIONALES = {2000, 4000, 2500, 1500, 3500};
    private static final float[] COSTO_HABITACION = {1200, 2100, 3500};

    public frmRegistro() {
        JFrame frame = new JFrame("Sistema de registro de vuelos");
        frame.setContentPane(panel2);
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lista = new clsLista();


        jbtRegistrar.addActionListener(_ -> {
            int cantidadDias = jsbDias.getValue();
            String tipoPago = jrbUnPago.isSelected() ? "Pago unico" : "6 meses sin intereses";
            String destinoTuristico = jlsDestinos.getSelectedValue() != null ? jlsDestinos.getSelectedValue().toString() : "";
            String tipoHabitacion = jcbDestinos.getSelectedItem() != null ? jcbDestinos.getSelectedItem().toString() : "";

            if (cantidadDias == 0 || destinoTuristico.isEmpty() || tipoHabitacion.isEmpty()) {
                jlbDinamic.setText("Datos incompletos");
            } else {
                jlbDinamic.setText("Registro exitoso");

                float costoAdicional = COSTOS_ADICIONALES[jlsDestinos.getSelectedIndex()];
                float[] costos = realizarCalculos(tipoHabitacion, cantidadDias, tipoPago);
                float subTotal = costos[0];
                float IVA = costos[1];
                float totalPagar = costos[2];
                float mensualidad = costos[3];

                lista.insertar(cantidadDias, destinoTuristico, tipoHabitacion, tipoPago, subTotal, IVA, totalPagar, mensualidad);
            }
        });

        jbtLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
                limpiarCampos();
            }
        });

        jlsDestinos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                destino = jlsDestinos.getSelectedValue().toString();
                jlbDestinos.setText("Destino turistico: " + destino);
            }
        });

        jbtRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new frmIngreso();
            }
        });

        jsbDias.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
            jlbDiasEstancia.setText("Dias de estancia: " + jsbDias.getValue());
            }
        });

        jcbDestinos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                habitacion = jcbDestinos.getSelectedItem().toString();
                jlbHabitacion.setText("Tipo de habitacion: " + habitacion);
            }
        });

        jbtInformacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new frmInfromacion(lista);
            }
        });


    }
    public float[] realizarCalculos(String tipoHabitacion, int cantidadDias, String tipoPago) {
        float subTotal;
        float IVA = 0;
        float totalPagar = 0;
        float mensualidad = 0;
        float costoHabitacion = 0; // Declarar fuera del if-else

        // Extraer el costo de la habitación
        if (tipoHabitacion.contains("Sencilla")) {
            costoHabitacion = COSTO_HABITACION[0];
        } else if (tipoHabitacion.contains("Doble")) {
            costoHabitacion = COSTO_HABITACION[1];
        } else {
            costoHabitacion = COSTO_HABITACION[2];
        }

        subTotal = (costoHabitacion * cantidadDias) + COSTOS_ADICIONALES[jlsDestinos.getSelectedIndex()];

        // Calcular el IVA dependiendo de la forma de pago
        if (Objects.equals(tipoPago, "Pago unico")) { // Pago con tarjeta le aplica IVA al total
            IVA = subTotal * 0.16f;
        } else { // Pago en mensualidades aumento de 10% al IVA que normalmente es del 16%
            IVA = subTotal * 0.24f;
        }

        totalPagar = subTotal + IVA;

        if (!Objects.equals(tipoPago, "Pago unico")) { // Pago en mensualidades
            mensualidad = totalPagar / 6;
        }

        return new float[]{subTotal, IVA, totalPagar, mensualidad};
    }
    public void limpiarCampos() {
        jlbDinamic.setText("Campos limpiados");
        jcbDestinos.setSelectedIndex(0);
        jsbDias.setValue(1);
        jrbUnPago.setSelected(true);
        jlsDestinos.clearSelection();
        jlbDestinos.setText("Destino turistico: ");
        jlbHabitacion.setText("Tipo de habitacion: ");
        jlbDiasEstancia.setText("Dias de estancia: ");
    }

}


