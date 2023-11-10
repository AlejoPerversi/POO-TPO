package com.grupo.tpo_poo.pago;

public class Pago {
    private double monto;
    protected String metodo;
    
    public Pago(double monto) {
        this.monto = monto;
    }

    public double calcularMonto() {
        return monto;
    }

    public String getMetodo() {
        return metodo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
