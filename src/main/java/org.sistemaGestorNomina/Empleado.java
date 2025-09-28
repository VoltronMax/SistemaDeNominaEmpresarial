package org.sistemaGestorNomina;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Map;

public class Empleado {

    private String nombreCompleto;
    private String cedula;
    private final int id;
    private Cargo cargo;
    private double sueldoBase;
    private Map<Mes, Nomina> nominas;
    private static int contador  = 1;

    public Empleado(String nombreCompleto, String cedula, Cargo cargo, double sueldoBase){
        this.sueldoBase = sueldoBase;
        this.id = contador++;
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.cargo = cargo;
        nominas = new LinkedHashMap<>();
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Nomina getNominasPorMes(Mes m){
        return nominas.get(m);
    }

    public void setNominas(Mes m, Nomina n) {
        this.nominas.put(m, n);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(cedula, empleado.cedula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cedula);
    }

    @Override
    public String toString() {
        return "\nEmpleado{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", cedula='" + cedula + '\'' +
                ", id=" + id +
                ", cargo=" + cargo +
                ", sueldoBase=" + sueldoBase +
                '}';
    }
}
