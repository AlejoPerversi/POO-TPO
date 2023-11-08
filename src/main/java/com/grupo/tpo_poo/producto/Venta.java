package com.grupo.tpo_poo.producto;

import com.grupo.tpo_poo.pago.Pago;

public class Venta {
    int idVenta;
    int idProducto;
    Pago medioPago;
    Producto producto;
    int cantidad;
    double precioBase;
    double montoTotal;

    public Venta(int idVenta, Producto producto, int cantidad, Pago medioPago) {
        this.idVenta = idVenta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.medioPago = medioPago;
        this.precioBase = producto.getPrecioUnitario() * cantidad;
        this.idProducto = producto.getCodigo();
        this.medioPago.setMonto(precioBase);
        this.montoTotal = medioPago.calcularMonto();
    }

    public int getIdVenta() {
        return idVenta;
    }

    public Pago getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(Pago medioPago) {
        this.medioPago = medioPago;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    

}
