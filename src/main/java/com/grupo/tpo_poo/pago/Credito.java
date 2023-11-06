package com.grupo.tpo_poo.pago;

public class Credito extends Pago {
    private int cuotas; //2, 3, 6
    private double inter; //6%, 12, 20%

    public Credito(double monto, int cuotas) {
        super(monto);
        this.cuotas = cuotas;
    }
    
    public double calcularMonto() {
        switch (cuotas) {
        case 2:
            inter = 0.06;
            break;

        case 3:
            inter = 0.12;
            break;

        case 6:
            inter = 0.2;
            break;
        }

        setMonto(getMonto() + getMonto() * inter);
        return getMonto();
    }

}
