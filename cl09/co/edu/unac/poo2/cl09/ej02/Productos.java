package co.edu.unac.poo2.cl09.ej02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.UUID;

public class Productos {
    private JPanel pnlProductos;
    private JLabel lblDescripcion;
    private JLabel lblPrecio;
    private JTextField txtDescripcion;
    private JTextField txtPrecio;
    private JButton btnAgregar;

    public JPanel getPnlProductos() {
        return pnlProductos;
    }

    public Productos() {
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Producto producto = new Producto(UUID.randomUUID().toString(), txtDescripcion.getText(), Double.valueOf(txtPrecio.getText()));
                    ProductoRepository repository = new ProductoRepositoryArchivo();
                    ProductoUseCase service = new ProductoService(repository);
                    service.crearProducto(producto);
                    JOptionPane.showMessageDialog(null, "Producto agregado exitosamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al crear producto", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
