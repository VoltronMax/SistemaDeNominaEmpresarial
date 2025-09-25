package org.sistemaGestorNomina;

public class Pago {
    private final int SALDO;
    private Empleado e;

    public Pago(Empleado e){
        this.SALDO = e.getSalario();
        this.e = e;
    }

    public int getSaldo(){
        return SALDO;
    }
}
