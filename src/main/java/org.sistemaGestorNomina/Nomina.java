package org.sistemaGestorNomina;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Nomina {

    private LocalDate fechaPago;
    private Empleado empleado;
    private int horasTrabajadas;
    private double montoBruto;
    private double montoPagado;
    private String titulo;
    private List<Registro> registros;

    public Nomina(Empleado empleado){
        this.empleado = empleado;
        registros = new ArrayList<>();
        setMontoBruto();
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getMontoBruto() {
        return montoBruto;
    }

    private void setMontoBruto() {
        this.montoBruto = this.empleado.getSueldoBase();
    }

    public void setRegistros(Registro r){
        registros.add(r);
    }

    public List<Registro> getRegistros(){
        return registros;
    }

    public void setMontoPagado(double montoPagado){
        this.montoPagado = montoPagado;
    }

    @Override
    public String toString() {
        return "Nomina{" +
                "fechaPago=" + fechaPago +
                ", empleado=" + empleado +
                ", horasTrabajadas=" + horasTrabajadas +
                ", montoBruto=" + montoBruto +
                ", montoPagado=" + montoPagado +
                ", titulo='" + titulo + '\'' +
                ", registros=" + registros +
                '}';
    }
}
