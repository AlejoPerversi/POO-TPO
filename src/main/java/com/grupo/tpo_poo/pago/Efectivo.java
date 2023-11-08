package com.grupo.tpo_poo.pago;

public class Efectivo extends Pago {

    public Efectivo(double monto) {
        super(monto);
    }
    
    public double calcularMonto() {
        return getMonto() - getMonto() * 0.1;
    }

}
