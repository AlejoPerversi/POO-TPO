package com.grupo.tpo_poo.producto;

import java.util.ArrayList;
import java.util.HashMap;

public class Catalogo {
    public static ArrayList<Producto> productos;

    public Catalogo() {
        productos = new ArrayList<Producto>();
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

}
