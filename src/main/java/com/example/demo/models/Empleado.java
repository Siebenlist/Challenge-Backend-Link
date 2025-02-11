package com.example.demo.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "EMPLEADOS")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DNI")
    private String dni;

    @Column(name = "IMPORTE")
    private Double importe;

    @Column(name = "FECHA_VISUALIZACION")
    private LocalDate fechaVisualizacion;


    public Empleado() {}

    public Empleado(String dni, Double importe){
        this.dni = dni;
        this.importe = importe;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaVisualizacion() {
        return fechaVisualizacion;
    }

    public void setFechaVisualizacion(LocalDate fechaVisualizacion) {
        this.fechaVisualizacion = fechaVisualizacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }
}
