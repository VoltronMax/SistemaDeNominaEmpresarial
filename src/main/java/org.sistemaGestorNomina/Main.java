package org.sistemaGestorNomina;


public class Main {
    public static void main(String[] args){

        //prueba
        Empleado uwu = new Empleado("Pedro Lopez", "93130337", Cargo.EMPLEADO, 1_500_000);
        Empleado a = new Empleado("Ashton Hall", "40772582", Cargo.ADMINISTRADOR, 3_000_000);

        Nomina n = new Nomina(uwu, Mes.ENERO);
        Nomina e = new Nomina(a, Mes.DICIEMBRE);

        a.setNominas(Mes.DICIEMBRE, e);
        uwu.setNominas(Mes.ENERO, n);



        GestorNomina ges = new GestorNomina();
        ges.agregarEmpleado(a);
        ges.agregarEmpleado(uwu);
        double res = ges.salarioConAuxilioDeTransporte("93130337", Mes.ENERO);
        System.out.println(res);
        System.out.println(ges.listarEmpleados());



    }
}
