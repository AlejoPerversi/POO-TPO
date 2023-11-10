package com.grupo.tpo_poo.producto;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.grupo.tpo_poo.ui.panels.PanelCatalogo;

public class Catalogo {
    public static ArrayList<Producto> productos;

    public Catalogo() {
        productos = new ArrayList<Producto>();
        Catalogo.populateCatalogoFromTable(PanelCatalogo.tableCatalogo);
    }

    public static boolean existeProducto(int id) {
        boolean existe = false;

        for (Producto p : productos) {
            if (p.getCodigo() == id) {
                existe = true;
            }
        }
        return existe;
    }

    public static Producto getProducto(int id) {
        if (existeProducto(id)) {
            for (Producto p : productos) {
                if (p.getCodigo() == id) {
                    return p;
                }
            }
        }
        return new Producto(0, "", 0, 0, 0);
    }
    
    public static ArrayList<String> formatoVenta() {
        ArrayList<String> productosVenta = new ArrayList<>();
        for (Producto p : productos) {
            String info = Integer.toString(p.getCodigo()) + " " +  p.getDescr();
            productosVenta.add(info);
        }

        return productosVenta;
    }

    public static void imprimirCatalogo() {
        for (Producto p : productos) {
            System.out.println(p.getCodigo() + ", " + p.getDescr() + ", " + p.getPrecioUnitario() + ", " + p.getStock() + ", " + p.getStockMin());
        }
    }

    public static void addProducto(Producto producto) {
        if (!existeProducto(producto.getCodigo())) {
            productos.add(producto);
        }
    }

    public static void borrarProducto(int index) {
        productos.remove(index);
    }

        public static void populateCatalogoFromTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        productos.clear();

        for (int row = 0; row < model.getRowCount(); row++) {
            int codigo = Integer.parseInt(model.getValueAt(row, 0).toString());
            String descr = model.getValueAt(row, 1).toString();
            double precioUnitario = Double.parseDouble(model.getValueAt(row, 2).toString());
            int stock = Integer.parseInt(model.getValueAt(row, 3).toString());
            int stockMin = Integer.parseInt(model.getValueAt(row, 4).toString());

            Producto producto = new Producto(codigo, descr, precioUnitario, stock, stockMin);
            productos.add(producto);
        }
    }

}
