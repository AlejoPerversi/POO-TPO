package com.grupo.tpo_poo.ui;

import javax.swing.JTabbedPane;
import java.awt.Font;
import com.grupo.tpo_poo.ui.panels.PanelVentas;
import com.grupo.tpo_poo.ui.panels.Config;
import com.grupo.tpo_poo.ui.panels.PanelCatalogo;

public class TabbedPane extends JTabbedPane {
    public PanelCatalogo stock;
    public PanelVentas sales;
    public Config config;

    public TabbedPane() {
        this.setFont(new Font("Roboto", Font.PLAIN, 13));
        stock = new PanelCatalogo();
        sales = new PanelVentas();
        config = new Config();

        this.setBounds(50, 50, Frame.WIDTH - 50, Frame.WIDTH - 50);
        this.addTab("Stock", null, stock, "Agregar y modificar stock de productos.");
        this.addTab("Sales", null, sales, "Vender productos en stock.");
        this.addTab("Config", null, config, "Cambiar configuraciones.");
    }


}
