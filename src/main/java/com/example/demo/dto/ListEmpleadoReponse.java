package com.example.demo.dto;

import java.util.List;

public class ListEmpleadoReponse {
    private List<EmpleadoDTO> empleados;

    public void ListEmpleadoResponse() {}

    public ListEmpleadoReponse(List<EmpleadoDTO> empleados){
        this.empleados = empleados;
    }

    public List<EmpleadoDTO> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<EmpleadoDTO> empleados) {
        this.empleados = empleados;
    }
}
