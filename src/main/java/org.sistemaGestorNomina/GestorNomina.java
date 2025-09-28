package org.sistemaGestorNomina;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GestorNomina {

    //Horas normales de trabajo al mes
    private static final int HORAS_MENSUALES = 240;

    //Descuentos legales
    private static final double PORCENTAJE_SALUD = 0.04;
    private static final double PORCENTAJE_PENSION = 0.04;
    private static final double PORCENTAJE_ARL = 0.05; //se redondea

    // Horas extra
    private static final double PORCENTAJE_EXTRA_DIURNA = 1.25;
    private static final double PORCENTAJE_EXTRA_NOCTURNA = 1.75;
    private static final double PORCENTAJE_EXTRA_DOMINICAL = 2.0;
    private static final double PORCENTAJE_EXTRA_FESTIVO = 2.0;

    // Parafiscal con registro en la nomina del gestor
    private static final double PORCENTAJE_PARAFISCALES = 0.9;

    //Auxilio de transporte obligatorio
    private static final int AUXILIO_DE_TRANSPORTE = 200_000;

    Map<String, Empleado>empleados;
    List<Registro> registros;

    public GestorNomina(){
        empleados = new LinkedHashMap<>();
        registros = new ArrayList<>();
    }

    //Atajos
    public void agregarEmpleado(Empleado e){
        empleados.put(e.getCedula(), e); //guarda en el gestor rapidamente un usuario respecto a su cedula
    }

    public Empleado accesoEmpleado(String c){
        return empleados.get(c); //devuelve un empleado respecto a el numero de cedula asociado
    }

    public List<Empleado> listarEmpleados(){
        List<Empleado> emps = new ArrayList<>(); //Crea una lista para facilitar la impresion e iteracion de empleados
        for(Map.Entry<String, Empleado> i : empleados.entrySet()){
            emps.add(i.getValue()); //Se itera sobre el map respecto al orden de insercion, y asi mismo guarda en la lista
        }
        return emps; //Devuelve la lista de empleados obtenida del map
    }

    //Horas
    public void registrarHoras(String c, int h, Mes me){
        Empleado emp = accesoEmpleado(c); //Guarda en una variable el empleado con la cedula indicada
        if(emp==null) return; //Si la cedula no da con un empleado real, termina la funcion

        Nomina n = emp.getNominasPorMes(me); //En una variable de tipo nomina, guarda aquella nomina que exista registrada en el empleado

        if(n!=null){
            n.setHorasTrabajadas(h); //Si ya hay una nomina con ese mes, aumenta las horas en la nomina correspondiente
        } else {
            Nomina nueo = new Nomina(emp, me); //Si no, crea la nueva nomina correspondiente a ese mes y aumenta las horas
            nueo.setHorasTrabajadas(h);
            emp.setNominas(me, nueo);
        }
    }

    public Nomina obtenerNominaMes(String c, Mes mes){
        Empleado e = accesoEmpleado(c);
        if(e==null){
            return null;
        }
        return  e.getNominasPorMes(mes);
    }

    public double salarioOrdinarioBruto(String c){
        return (accesoSalario(c) * HORAS_MENSUALES);

    }

    public double accesoSalario(String cedula){
        Empleado emp = empleados.get(cedula);
        if (emp != null) {
            return emp.getSueldoBase();
        }
        return 0.0;
    }

    //A calcular al final de la nomina
    public double salarioConAuxilioDeTransporte(String c, Mes mes) {
        if (accesoSalario(c) != 0.0) {
            Registro r = new Registro(LocalDate.now(), "Auxilio de transporte obligatorio", Mes.ENERO);
            agregarRegistro(r);
            return accesoSalario(c) + AUXILIO_DE_TRANSPORTE;
        }
        return 0.0;
    }

    public List<Registro> mostrarRegistros(){
        return registros;
    }

    public void agregarRegistro(Registro r){
        registros.add(r);
    }

    public int getHorasMensuales(){
        return HORAS_MENSUALES;
    }

    /* public Double salarioConAuxilioDeTransporte(String cedula){
        Empleado emp = empleados.get(cedula);
        if(emp != null){
            Registro r = new Registro(LocalDate.now(), "Auxilio de transporte obligatorio");
            agregarRegistro(r);
            return emp.getSueldoBase()+AUXILIO_DE_TRANSPORTE;
        }
        return 0.0;
    }
     */

}
