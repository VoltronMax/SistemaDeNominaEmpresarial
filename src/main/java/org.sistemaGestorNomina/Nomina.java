package org.sistemaGestorNomina;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Nomina {

    private LocalDate fechaPago;
    private Empleado empleado;
    private int horasTrabajadas;
    private int montoBruto;
    private int montoPagado;
    private String titulo;
    private List<Registro> registros;

    public Nomina(Empleado empleado, int horasTrabajadas, int montoBruto){
        this.empleado = empleado;
        this.horasTrabajadas = horasTrabajadas;
        this.montoBruto = montoBruto;
        registros = new ArrayList<>();
    }













}
