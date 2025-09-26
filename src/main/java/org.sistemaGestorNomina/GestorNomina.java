package org.sistemaGestorNomina;

import java.util.LinkedHashMap;
import java.util.Map;

public class GestorNomina {
    Map<String, Empleado>empleados;

    public GestorNomina(){
        empleados = new LinkedHashMap<>();
    }
}
