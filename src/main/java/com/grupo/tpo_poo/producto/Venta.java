package com.grupo.tpo_poo.producto;

import java.util.ArrayList;
import com.grupo.tpo_poo.pago.Credito;
import com.grupo.tpo_poo.pago.Debito;
import com.grupo.tpo_poo.pago.Efectivo;
import com.grupo.tpo_poo.pago.Pago;

public class Venta {
    int idVenta;
    String medio;
    Producto producto;
    Pago medioPago;
    int cantidad;
    int cuotas;
    double total;

    public Venta(int idVenta, Producto producto, int cantidad, String medio, int cuotas) {
        this.idVenta = idVenta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.cuotas = cuotas;

        switch (medio) {
            case "Efectivo":
                medioPago = new Efectivo(producto.getPrecioUnitario() * cantidad);
                break;

            case "Debito":
                medioPago = new Debito(producto.getPrecioUnitario() * cantidad);
                break;

            case "Credito":
                medioPago = new Credito(producto.getPrecioUnitario() * cantidad, cuotas);
                break;
        }
        System.out.println(medioPago.getMetodo());
        this.total = medioPago.calcularMonto();
    }

    public int getIdVenta() {
        return idVenta;
    }

    public String getMedioPago() {
        return medioPago.getMetodo();
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public Object[] getVentaObject() {
        ArrayList<Object> datosVenta = new ArrayList<>();
        datosVenta.add(idVenta);
        datosVenta.add(producto.getCodigo());
        datosVenta.add(producto.getDescr());
        datosVenta.add(cantidad);
        datosVenta.add(medioPago.getMetodo());
        datosVenta.add(cuotas);
        datosVenta.add(total);

        return datosVenta.toArray();
    }

}
