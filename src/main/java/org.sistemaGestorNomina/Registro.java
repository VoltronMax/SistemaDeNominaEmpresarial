package org.sistemaGestorNomina;

import java.time.LocalDate;

public class Registro {

    private LocalDate fechaRegistro;
    private String descripcion;
    private Horas horas;
    private DeduccionSalarial conceptoDeduccion;

    public Registro(LocalDate fechaRegistro, String descripcion){
        this.fechaRegistro = LocalDate.now();
        this.descripcion = descripcion;
    }

    public Registro(LocalDate fechaRegistro, String descripcion, Horas horas){
        this.fechaRegistro = LocalDate.now();
        this.descripcion = descripcion;
        this.horas = horas;
    }

    public Registro(LocalDate fechaRegistro, String descripcion, DeduccionSalarial conceptoDeduccion){
        this.fechaRegistro = LocalDate.now();
        this.descripcion = descripcion;
        this.conceptoDeduccion = conceptoDeduccion;
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
