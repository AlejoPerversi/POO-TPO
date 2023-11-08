package com.grupo.tpo_poo.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class CSVHandler {

    public static boolean exportToCSV(JTable table, String exportPath) {
        try {
            TableModel model = table.getModel();
            FileWriter csv = new FileWriter(new File(exportPath));

            for (int i = 0; i < model.getColumnCount(); i++) {
                csv.write(model.getColumnName(i) + ",");
            }

            csv.write("\n");

            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    csv.write(model.getValueAt(i, j).toString() + ",");
                }
                csv.write("\n");
            }

            csv.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
    return false;
    
    }

public static DefaultTableModel deserializeFromCSV(String csvFilePath) {
    DefaultTableModel tableModel = new DefaultTableModel();

    try {
        BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
        String line;

        // Read the header row and split it into column names
        if ((line = reader.readLine()) != null) {
            String[] columnNames = line.split(",");
            for (String columnName : columnNames) {
                tableModel.addColumn(columnName);
            }
        }

        // Read and add data rows to the table model
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            tableModel.addRow(data);
        }

        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    return tableModel;
    }


}
