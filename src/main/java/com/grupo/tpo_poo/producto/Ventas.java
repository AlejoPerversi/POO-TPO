package com.grupo.tpo_poo.producto;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.grupo.tpo_poo.ui.panels.PanelVentas;

public class Ventas {
    public static ArrayList<Venta> ventas;

    public Ventas() {
        ventas = new ArrayList<Venta>();
        Ventas.populateVentasFromTable(PanelVentas.tableVentas);
    }

    public static boolean existeVenta(int id) {
        boolean existe = false;

        for (Venta v : ventas) {
            if (v.getIdVenta() == id) {
                existe = true;
            }
        }
        return existe;
    }

    public static void imprimirVentas() {
        for (Venta v : ventas) {
            System.out.println(v.getIdVenta() + " " + v.getProducto().getDescr() + " " + v.getCantidad() + " " + v.getMedioPago() + " " + v.getTotal());
        }
    }

    public static void addVenta(Venta venta) {
        if (!existeVenta(venta.getIdVenta())) {
            ventas.add(venta);
        }
    }

    public static void borrarVenta(int index) {
        ventas.remove(index);
    }

    public static void populateVentasFromTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        ventas.clear();

        for (int row = 0; row < model.getRowCount(); row++) {
            int codigo = Integer.parseInt(model.getValueAt(row, 0).toString());
            int idProducto = Integer.parseInt(model.getValueAt(row, 1).toString());
            String descr = model.getValueAt(row, 2).toString();
            int cantidad = Integer.parseInt(model.getValueAt(row, 3).toString());
            String medioPago = model.getValueAt(row, 4).toString();
            int cuotas = Integer.parseInt(model.getValueAt(row, 5).toString());

            Venta venta = new Venta(codigo, Catalogo.getProducto(idProducto), cantidad, medioPago, cuotas);

            ventas.add(venta);
        }
    }
    
}
