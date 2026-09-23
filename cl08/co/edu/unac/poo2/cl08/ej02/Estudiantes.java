package co.edu.unac.poo2.cl08.ej02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Estudiantes {
    private JPanel pnlEstudiantes;
    private JLabel lblTitulo;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblEdad;
    private JTextField txtEdad;
    private JButton btnAgregar;

    public JPanel getPnlEstudiantes() {
        return this.pnlEstudiantes;
    }

    public Estudiantes() {
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = txtNombre.getText();
                    int edad = Integer.valueOf(txtEdad.getText());
                    Estudiante estudiante = new Estudiante(nombre, edad);
                    EstudianteController controller = new EstudianteController();
                    if (controller.registrarEstudiante(estudiante)) {
                        JOptionPane.showMessageDialog(null, "Estudiante creado exitosamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al crear estudiante.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al crear estudiante.", "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
                txtNombre.setText("");
                txtEdad.setText("");
            }
        });
    }
}
