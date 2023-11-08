package com.grupo.tpo_poo.util;

import com.grupo.tpo_poo.ui.panels.Config;
import com.grupo.tpo_poo.ui.panels.PanelCatalogo;
import com.grupo.tpo_poo.ui.panels.PanelVentas;

public class ShutdownHook {

    public ShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            this.onClose();
        }));
    }

    public void onClose() {
        if (Config.guardarAlSalir.isSelected()) {
            System.out.println("Guardando datos...");
            CSVHandler.exportToCSV(PanelCatalogo.tableCatalogo, "catalogo.csv");
            CSVHandler.exportToCSV(PanelVentas.tableVentas, "ventas.csv");
        }
    }
    
}
