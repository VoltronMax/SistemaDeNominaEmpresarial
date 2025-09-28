package org.sistemaGestorNomina;

import java.time.LocalDate;

public class Registro {

    private LocalDate fechaRegistro;
    private String descripcion;
    private Horas horas;
    private DeduccionSalarial conceptoDeduccion;
    private Mes mes;
    private Bono bono;

    public Registro(LocalDate fechaRegistro, String descripcion, Mes mes){
        this.fechaRegistro = LocalDate.now();
        this.descripcion = descripcion;
        this.mes = mes;
    }

    public Registro(LocalDate fechaRegistro, String descripcion, Horas horas, Mes mes){
        this.fechaRegistro = LocalDate.now();
        this.descripcion = descripcion;
        this.horas = horas;
        this.mes = mes;
    }

    public Registro(LocalDate fechaRegistro, String descripcion, DeduccionSalarial conceptoDeduccion, Mes mes){
        this.fechaRegistro = LocalDate.now();
        this.descripcion = descripcion;
        this.conceptoDeduccion = conceptoDeduccion;
        this.mes = mes;
    }

    public Registro(LocalDate fechaRegistro, String descripcion, Bono bono, Mes mes){
        this.fechaRegistro = LocalDate.now();
        this.descripcion = descripcion;
        this.bono = bono;
        this.mes = mes;
    }

    public Mes getMes() {
        return mes;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public Bono getBono() {
        return bono;
    }

    public void setBono(Bono bono) {
        this.bono = bono;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Horas getHoras() {
        return horas;
    }

    public void setHoras(Horas horas) {
        this.horas = horas;
    }

    public DeduccionSalarial getConceptoDeduccion() {
        return conceptoDeduccion;
    }

    public void setConceptoDeduccion(DeduccionSalarial conceptoDeduccion) {
        this.conceptoDeduccion = conceptoDeduccion;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "fechaRegistro=" + fechaRegistro +
                ", descripcion='" + descripcion + '\'' +
                ", horas=" + horas +
                ", conceptoDeduccion=" + conceptoDeduccion +
                '}';
    }
}
