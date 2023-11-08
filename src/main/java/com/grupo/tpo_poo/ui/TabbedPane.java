package com.grupo.tpo_poo.ui;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

import com.grupo.tpo_poo.ui.panels.PanelVentas;
import com.grupo.tpo_poo.ui.panels.PanelCatalogo;

public class TabbedPane extends JTabbedPane {
    public PanelCatalogo stock;
    public PanelVentas sales;

    public TabbedPane() {
        stock = new PanelCatalogo();
        sales = new PanelVentas();

        this.setBounds(50, 50, Frame.WIDTH - 50, Frame.WIDTH - 50);
        this.addTab("Stock", null, stock, "Agregar y modificar stock de productos.");
        this.addTab("Sales", null, sales, "Vender productos en stock.");
    }

    public void setTab(JPanel panel) {
        this.setSelectedComponent(panel);
    }

}
