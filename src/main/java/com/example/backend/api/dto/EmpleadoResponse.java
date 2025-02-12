package com.example.backend.api.dto;

public class EmpleadoResponse {
    private String dni;
    private boolean prestamoDisponible;
    private boolean empleadoEncontrado;
    private boolean empleadoInvalido;
    private Double importe;
    private String respuesta;

    public EmpleadoResponse() {}

    public EmpleadoResponse(Boolean empleadoInvalido, String dni, String respuesta) {
        this.empleadoInvalido = empleadoInvalido;
        this.empleadoEncontrado = false;
        this.respuesta = respuesta;
    }

    public EmpleadoResponse(boolean prestamoDisponible, boolean empleadoEncontrado, Double importe, String respuesta){
        this.dni = dni;
        this.prestamoDisponible = prestamoDisponible;
        this.empleadoEncontrado = empleadoEncontrado;
        this.empleadoInvalido = false;
        this.importe = importe;
        this.respuesta = respuesta;
    }

    public boolean isEmpleadoEncontrado() {
        return empleadoEncontrado;
    }

    public void setEmpleadoEncontrado(boolean empleadoEncontrado) {
        this.empleadoEncontrado = empleadoEncontrado;
    }

    public boolean isEmpleadoInvalido() {
        return empleadoInvalido;
    }

    public void setEmpleadoInvalido(boolean empleadoInvalido) {
        this.empleadoInvalido = empleadoInvalido;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public boolean isPrestamoDisponible() {
        return prestamoDisponible;
    }

    public void setPrestamoDisponible(boolean prestamoDisponible) {
        this.prestamoDisponible = prestamoDisponible;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

}
