package com.grupo.tpo_poo.producto;

import java.util.ArrayList;

/* De cada producto se registrará: 
código, descripción, precio unitario, cantidad en stock, stock mínimo */

public class Producto {
    private int codigo;
    private String descr;
    private double precioUnitario;
    private int stock;
    private int stockMin;

    public Producto(int codigo, String descr, double precioUnitario, int stock, int stockMin) {
        this.codigo = codigo;
        this.descr = descr;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.stockMin = stockMin;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public Object[] getProdcutoObject() {
        ArrayList<Object> datosProducto = new ArrayList<>();
        datosProducto.add(codigo);
        datosProducto.add(descr);
        datosProducto.add(precioUnitario);
        datosProducto.add(stock);
        datosProducto.add(stockMin);
        return datosProducto.toArray();
    }

}
