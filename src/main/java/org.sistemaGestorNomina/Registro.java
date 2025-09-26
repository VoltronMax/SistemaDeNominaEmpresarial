package org.sistemaGestorNomina;

import java.time.LocalDate;

public class Registro {

    private LocalDate fechaRegistro;
    private String descripcion;

    public Registro(LocalDate fechaRegistro, String descripcion){
        this.fechaRegistro = LocalDate.now();
        this.descripcion = descripcion;
    }
}
