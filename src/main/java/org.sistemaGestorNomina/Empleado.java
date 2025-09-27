package org.sistemaGestorNomina;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empleado {

    private String nombreCompleto;
    private String cedula;
    private final int id;
    private Cargo cargo;
    private int sueldoBase;
    private List<Nomina> nominas;
    private static int contador  = 0001;

    public Empleado(String nombreCompleto, String cedula, Cargo cargo, int sueldoBase){
        this.sueldoBase = sueldoBase;
        this.id = contador++;
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.cargo = cargo;
        nominas = new ArrayList<>();
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
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

    public List<Nomina> getNominas() {
        return nominas;
    }

    public void setNominas(Nomina e) {
        this.nominas.add(e);
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
        return "Empleado{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", cedula='" + cedula + '\'' +
                ", id=" + id +
                ", cargo=" + cargo +
                ", sueldoBase=" + sueldoBase +
                ", nominas=" + nominas +
                '}';
    }
}
