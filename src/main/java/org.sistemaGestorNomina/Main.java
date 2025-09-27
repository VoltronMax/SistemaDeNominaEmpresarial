package org.sistemaGestorNomina;


public class Main {
    public static void main(String[] args){

        //prueba
        Empleado uwu = new Empleado("uwu lopez", "93130337", Cargo.EMPLEADO, 1_500_000);
        Nomina nominauwu = new Nomina(uwu);
        GestorNomina gestoruwu = new GestorNomina();
        gestoruwu.agregarEmpleado(uwu);
        var dx = gestoruwu.salarioConAuxilioDeTransporte("93130337");
        System.out.printf("%.2f", dx) ;
    }
}
