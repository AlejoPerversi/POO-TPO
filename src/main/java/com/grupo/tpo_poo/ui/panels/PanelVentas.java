package com.grupo.tpo_poo.ui.panels;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import com.grupo.tpo_poo.ui.components.Button;
import com.grupo.tpo_poo.ui.components.Label;
import com.grupo.tpo_poo.ui.components.TableModelVentas;
import com.grupo.tpo_poo.ui.components.TextField;
import com.grupo.tpo_poo.producto.Catalogo;

public class PanelVentas extends JPanel implements ActionListener {
    Label labelCodigo;
    Label labelProducto;
    Label labelCantidad;
    Label labelMedioPago;
    TextField textCodigo;
    JComboBox<String> comboBoxProducto;
    TextField textCantidad;
    JComboBox<String> comboBoxMedioPago;
    Label labelCuotas;
    JComboBox<Integer> comboBoxCuotas;
    JPanel leftPanel;
    JPanel topLeftPannel;
    JPanel bottomLeftPanel;
    JScrollPane scrollPane;
    Button buttonAdd;
    Button buttonRemove;
    TableModelVentas modelVentas;
    public static JTable tableVentas;
    
    public PanelVentas() {
        this.setLayout(new GridLayout(1, 2));
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        leftPanel = new JPanel(new GridLayout(2, 1));
        topLeftPannel = new JPanel(new GridLayout(5, 2, 0, 10));
        bottomLeftPanel = new JPanel(new GridLayout(2, 2));

        labelCodigo = new Label("Id Venta:");
        textCodigo = new TextField();
        labelProducto = new Label("Producto:");
        comboBoxProducto = new JComboBox<String>();
        comboBoxProducto.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                ArrayList<String> items = Catalogo.formatoVenta();
                comboBoxProducto.removeAllItems();
                for (String s : items) {
                    comboBoxProducto.addItem(s);
                }
            }
        
            @Override
            public void focusLost(FocusEvent e) {}
        });

        labelCantidad = new Label("Cantidad:");
        textCantidad = new TextField();
        labelMedioPago = new Label("Medio Pago:");
        comboBoxMedioPago = new JComboBox<String>(new String[]{"Debito", "Credito", "Efectivo"});
        comboBoxMedioPago.addActionListener(this);

        labelCuotas = new Label("Cuotas:");
        comboBoxCuotas = new JComboBox<Integer>(new Integer[]{2, 3, 6});
        labelCuotas.setVisible(false);
        comboBoxCuotas.setVisible(false);

        topLeftPannel.add(labelCodigo);
        topLeftPannel.add(textCodigo);
        topLeftPannel.add(labelProducto);
        topLeftPannel.add(comboBoxProducto);
        topLeftPannel.add(labelCantidad);
        topLeftPannel.add(textCantidad);
        topLeftPannel.add(labelMedioPago);
        topLeftPannel.add(comboBoxMedioPago);
        topLeftPannel.add(labelCuotas);
        topLeftPannel.add(comboBoxCuotas);

        buttonAdd = new Button("Agregar", "Agregar una venta.", this);
        buttonRemove = new Button("Eliminar", "Eliminar una venta.", this);

        buttonAdd.setMaximumSize(new java.awt.Dimension(20, 20));
        buttonRemove.setMaximumSize(new java.awt.Dimension(20, 20));

        bottomLeftPanel.add(buttonAdd);
        bottomLeftPanel.add(buttonRemove);

        topLeftPannel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        bottomLeftPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        leftPanel.add(topLeftPannel);
        leftPanel.add(bottomLeftPanel);

        tableVentas = new JTable();
        modelVentas = new TableModelVentas(tableVentas);
        tableVentas.setModel(modelVentas);

        scrollPane = new JScrollPane(tableVentas);

        this.add(leftPanel);
        this.add(scrollPane);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBoxMedioPago) {
            if (comboBoxMedioPago.getSelectedItem() == "Credito") {
                labelCuotas.setVisible(true);
                comboBoxCuotas.setVisible(true);
            } else {
                labelCuotas.setVisible(false);
                comboBoxCuotas.setVisible(false);
            }
        }

    }

}
