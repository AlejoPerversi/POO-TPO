package com.grupo.tpo_poo.pago;

public class Pago {
    private double monto;
    
    public Pago(double monto) {
        this.monto = monto;
    }

    public double calcularMonto() {
        return monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
