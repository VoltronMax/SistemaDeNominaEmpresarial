package org.sistemaGestorNomina;

public class Main {
    public static void main(String[] args){

        Empleado uwu = new Empleado(100_000);
        Pago pagouwu = new Pago(uwu);
        System.out.println(pagouwu.getSaldo());


    }
}
