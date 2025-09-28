package org.sistemaGestorNomina;


public class Main {
    public static void main(String[] args){

        //prueba
        Empleado uwu = new Empleado("Pedro Lopez", "93130337", Cargo.EMPLEADO, 1_500_000);
        Nomina n = new Nomina(uwu, Mes.ENERO);

        uwu.setNominas(Mes.ENERO, n);

        GestorNomina ges = new GestorNomina();
        ges.agregarEmpleado(uwu);
        ges.registrarHoras(uwu.getCedula(), 240, n.getMes());
        ges.salarioOrdinarioBrutoPorMes(uwu.getCedula(), n.getMes());
        ges.registrarBonificaciones(uwu.getCedula(), n.getMes(), 100_000, Bono.PREMIO);
        ges.registrarHorasExtra(uwu.getCedula(), n.getMes(),10, Horas.EXTRA_NOCTURNA);
        ges.calcularDeducciones(uwu.getCedula(), n.getMes());
        ges.salarioConAuxilioDeTransporte(uwu.getCedula(), n.getMes());

        double dx = n.getMontoBruto();
        double m = ges.salarioOrdinarioBrutoPorMes(uwu.getCedula(), n.getMes());

        System.out.println(m);

    }
}
