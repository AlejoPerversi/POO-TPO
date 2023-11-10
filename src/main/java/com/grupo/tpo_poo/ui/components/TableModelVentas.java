package com.grupo.tpo_poo.ui.components;

import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.grupo.tpo_poo.util.CSVHandler;

public class TableModelVentas extends DefaultTableModel {
    JTable table;

    public TableModelVentas(JTable table) {
        this.table = table;
        this.addColumn("IdVenta");
        this.addColumn("IdProducto");
        this.addColumn("Producto");
        this.addColumn("Cantidad");
        this.addColumn("MedioPago");
        this.addColumn("Cuotas");
        this.addColumn("Total");

        this.loadCSVData("data/ventas.csv");
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column == Integer.MAX_VALUE;
    }

    public void loadCSVData(String csvFilePath) {
        DefaultTableModel tableModel = CSVHandler.deserializeFromCSV(csvFilePath);
        if (tableModel != null) {
            setRowCount(0);
            for (int row = 0; row < tableModel.getRowCount(); row++) {
                Vector<Object> rowData = new Vector<>();
                for (int column = 0; column < tableModel.getColumnCount(); column++) {
                    rowData.add(tableModel.getValueAt(row, column));
                }
                addRow(rowData);
            }
        }
    }

}
