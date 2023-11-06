package com.grupo.tpo_poo.ui.panels;

import javax.swing.*;
import com.grupo.tpo_poo.producto.Catalogo;
import com.grupo.tpo_poo.producto.Producto;
import com.grupo.tpo_poo.ui.components.*;
import java.awt.GridLayout;
import java.awt.event.*;

public class PanelCatalogo extends JPanel implements ActionListener {
    Label labelCodigo;
    Label labelDescr;
    Label labelPrecioUnitario;
    Label labelStock;
    Label labelStockMin;
    TextField textCodigo;
    JTextField textDescr;
    JTextField textPrecioUnitario;
    JTextField textStock;
    JTextField textStockMin;
    JPanel topPanel;
    JPanel topLeftPannel;
    JPanel topRightPanel;
    JScrollPane scrollPane;
    Button buttonAdd;
    Button buttonRemove;
    Button buttonCatalogo;
    JTable tableCatalogo;
    TableModelCatalogo modelCatalogo;
    
    public PanelCatalogo() {
        topPanel = new JPanel(new GridLayout(1, 2));
        topLeftPannel = new JPanel(new GridLayout(5, 2, 0, 10));
        topRightPanel = new JPanel(new GridLayout(3, 1));

        this.setLayout(new GridLayout(2, 1));
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        labelCodigo = new Label("Código:");
        textCodigo = new TextField();
        labelDescr = new Label("Descripción:");
        textDescr = new JTextField();
        labelPrecioUnitario = new Label("Precio Unitario:");
        textPrecioUnitario = new JTextField();
        labelStock = new Label("Stock:");
        textStock = new JTextField();
        labelStockMin = new Label("Stock Min:");
        textStockMin = new JTextField();

        topLeftPannel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        topRightPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        topLeftPannel.add(labelCodigo);
        topLeftPannel.add(textCodigo);
        topLeftPannel.add(labelDescr);
        topLeftPannel.add(textDescr);
        topLeftPannel.add(labelPrecioUnitario);
        topLeftPannel.add(textPrecioUnitario);
        topLeftPannel.add(labelStock);
        topLeftPannel.add(textStock);
        topLeftPannel.add(labelStockMin);
        topLeftPannel.add(textStockMin);

        buttonAdd = new Button("Add", "Agregar un elemento a la tabla", this);
        buttonRemove = new Button("Remove", "Eliminar un elemento de la tabla", this);
        buttonCatalogo = new Button("Mostrar Catalogo", "Ver el listado de items del catalogo", this);

        topRightPanel.add(buttonAdd);
        topRightPanel.add(buttonRemove);
        topRightPanel.add(buttonCatalogo);

        topPanel.add(topLeftPannel);
        topPanel.add(topRightPanel);
        
        tableCatalogo = new JTable();
        modelCatalogo = new TableModelCatalogo(tableCatalogo);
        tableCatalogo.setModel(modelCatalogo);

        scrollPane = new JScrollPane(tableCatalogo);

        this.add(topPanel);
        this.add(scrollPane);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonAdd) {

            Producto producto = new Producto(Integer.parseInt(textCodigo.getText()), textDescr.getText(), Double.parseDouble(textPrecioUnitario.getText()), Integer.parseInt(textStock.getText()), Integer.parseInt(textStockMin.getText()));

            if (!Catalogo.existeProducto(Integer.parseInt(textCodigo.getText()))) {
                modelCatalogo.addRow(producto.getProdcutoObject());
                Catalogo.addProducto(producto);
            } else {
                JOptionPane.showMessageDialog(null, "Un elemento con este id existe.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == buttonRemove) {
            int row = tableCatalogo.getSelectedRow();
            Catalogo.borrarProducto(row);
            modelCatalogo.removeRow(row);
        }

        if (e.getSource() == buttonCatalogo) {
            Catalogo.imprimirCatalogo();
        }

    }

}
