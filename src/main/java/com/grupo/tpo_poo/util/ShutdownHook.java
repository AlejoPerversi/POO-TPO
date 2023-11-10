package com.grupo.tpo_poo.util;

import java.io.File;

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
            String catalogoFilePath = "data/catalogo.csv";
            String ventasFilePath = "data/ventas.csv";

            // Get the directory where the JAR file is located
            String currentDir = System.getProperty("user.dir");

            // Create absolute paths
            String absoluteCatalogoFilePath = currentDir + File.separator + catalogoFilePath;
            String absoluteVentasFilePath = currentDir + File.separator + ventasFilePath;

            // Check if the directory exists, and create it if not
            File dataDirectory = new File(currentDir + File.separator + "data");
            if (!dataDirectory.exists()) {
                if (dataDirectory.mkdirs()) {
                    System.out.println("Se creo el directorio de datos.");
                } else {
                    System.err.println("No se pudo crear el directorio de datos.");
                }
            }

            CSVHandler.exportToCSV(PanelCatalogo.tableCatalogo, absoluteCatalogoFilePath);
            CSVHandler.exportToCSV(PanelVentas.tableVentas, absoluteVentasFilePath);
        }
    }
}
