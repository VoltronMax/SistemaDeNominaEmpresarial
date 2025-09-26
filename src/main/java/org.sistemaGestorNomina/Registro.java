package org.sistemaGestorNomina;

import java.time.LocalDate;

public class Registro {

    private LocalDate fechaRegistro;
    private String descripcion;
    private Horas horas;

    public Registro(LocalDate fechaRegistro, String descripcion, Horas horas){
        this.fechaRegistro = LocalDate.now();
        this.descripcion = descripcion;
        this.horas = horas;
    }
}
