package org.sistemaGestorNomina;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GestorNomina {

    //Descuentos legales
    private static final double PORCENTAJE_SALUD = 0.04;
    private static final double PORCENTAJE_PENSION = 0.04;
    private static final double PORCENTAJE_ARL = 0.05; //se redondea

    // Horas extra
    private static final double PORCENTAJE_EXTRA_DIURNA = 1.25;
    private static final double PORCENTAJE_EXTRA_NOCTURNA = 1.75;
    private static final double PORCENTAJE_EXTRA_DOMINICAL = 2.0;
    private static final double PORCENTAJE_EXTRA_FESTIVO = 2.0;

    private static final double PORCENTAJE_PARAFISCALES = 0.9;

    private static final int AUXILIO_DE_TRANSPORTE = 200_000;

    Map<String, Empleado>empleados;
    List<Registro> registros;

    public GestorNomina(){
        empleados = new LinkedHashMap<>();
        registros = new ArrayList<>();

    }

    public void agregarEmpleado(Empleado e){
        empleados.put(e.getCedula(), e);
    }

    public Double salarioConAuxilioDeTransporte(String cedula){
        Empleado emp = empleados.get(cedula);
        if(emp != null){
            Registro r = new Registro(LocalDate.now(), "Auxilio de transporte");
            registros.add(r);
            return (double) emp.getSueldoBase()+AUXILIO_DE_TRANSPORTE;
        }
        return null;
    }








}
