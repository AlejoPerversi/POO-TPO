package com.grupo.tpo_poo.producto;

import java.util.ArrayList;

public class Ventas {
    public static ArrayList<Venta> ventas;

    public Ventas() {
        ventas = new ArrayList<Venta>();
    }

    public static boolean existeVenta(int id) {
        boolean existe = false;

        for (Venta v : ventas) {
            if (v.idVenta == id) {
                existe = true;
            }
        }
        return existe;
    }

    public static void addVenta(Venta venta) {
        if (!existeVenta(venta.getIdVenta())) {
            ventas.add(venta);
        }
    }

    public static void borrarVenta(int index) {
        ventas.remove(index);
    }


}
