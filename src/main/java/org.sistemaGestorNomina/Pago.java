package org.sistemaGestorNomina;

public class Pago {
    private int saldo;
    private Empleado e;

    public Pago(Empleado e){
        this.saldo = e.getSalario();
        this.e = e;
    }

    public int getSaldo(){
        return saldo;
    }
}
