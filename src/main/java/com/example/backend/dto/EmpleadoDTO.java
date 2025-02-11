package com.example.backend.dto;

import com.example.backend.models.Empleado;

public class EmpleadoDTO {

    private String dni;
    private Double importe;

    public EmpleadoDTO() {}

    public EmpleadoDTO(Empleado empleado){
        this.dni = empleado.getDni();
        this.importe = empleado.getImporte();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }
}
