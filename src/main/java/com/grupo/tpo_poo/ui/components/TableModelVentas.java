package com.grupo.tpo_poo.ui.components;

import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import com.grupo.tpo_poo.producto.Catalogo;
import com.grupo.tpo_poo.producto.Producto;

public class TableModelVentas extends DefaultTableModel {
    
    JTable table;

    public TableModelVentas(JTable table) {
        this.table = table;
        this.addColumn("Id");
        this.addColumn("Producto");
        this.addColumn("Cantidad");
        this.addColumn("MedioPago");
        this.addColumn("Total");

        this.addTableModelListener(new TableModelListener() {
            public void tableChanged(TableModelEvent e) {

                switch (e.getType()) {
                    case TableModelEvent.INSERT:
                        System.out.println("Se insertó una venta nueva.");
                        break;

                    case TableModelEvent.DELETE:
                        System.out.println("Se eliminó una venta.");
                        break;

                    case TableModelEvent.UPDATE:
                        System.out.println("Se actualizaron datos.");
                        int row = e.getFirstRow();
                        int column = e.getColumn();

                        Producto producto = Catalogo.productos.get(row);
                        Object cellValue = table.getValueAt(row, column);

                        switch (column) {
                            case 0: //Codigo
                                producto.setCodigo(Integer.parseInt((String)cellValue));
                                break;

                            case 1: //Descr
                                producto.setDescr((String)cellValue);
                                break;

                            case 2: //PrecioUni
                                producto.setPrecioUnitario(Double.parseDouble((String)cellValue));
                                break;

                            case 3: //Stock
                                producto.setStock(Integer.parseInt((String)cellValue));
                                break;

                            case 4: //Stock Min
                                producto.setStockMin(Integer.parseInt((String)cellValue));
                                break;
                        }
                        break;
                }
            }
        });
    }

}
