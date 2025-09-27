package org.sistemaGestorNomina;

import java.util.LinkedHashMap;
import java.util.Map;

public class GestorNomina {
    Map<String, Empleado>empleados;

    public GestorNomina(){
        empleados = new LinkedHashMap<>();
    }

    public void agregarEmpleado(Empleado e){
        empleados.put(e.getCedula(), e);
    }






}
