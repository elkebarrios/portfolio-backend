
package com.prueba4.Sprintboot4.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;


@Entity 
public class ExperienciaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String logoEmpresa;
    private String cargo;
    private String empleoActual;
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    private String nombreEmpresa;
    @Column(length  =  10000) 
     private String descripcionCargo;
    @Column(length  =  10000)
    private String aptitud;

    public ExperienciaModel() {
    }

    public ExperienciaModel(Long id, String logoEmpresa, String cargo, String empleoActual, Date fechaInicio, Date fechaFin, String nombreEmpresa, String descripcionCargo, String aptitud) {
        this.id = id;
        this.logoEmpresa = logoEmpresa;
        this.cargo = cargo;
        this.empleoActual = empleoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombreEmpresa = nombreEmpresa;
        this.descripcionCargo = descripcionCargo;
        this.aptitud = aptitud;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogoEmpresa() {
        return logoEmpresa;
    }

    public void setLogoEmpresa(String logoEmpresa) {
        this.logoEmpresa = logoEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpleoActual() {
        return empleoActual;
    }

    public void setEmpleoActual(String empleoActual) {
        this.empleoActual = empleoActual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDescripcionCargo() {
        return descripcionCargo;
    }

    public void setDescripcionCargo(String descripcionCargo) {
        this.descripcionCargo = descripcionCargo;
    }

    public String getAptitud() {
        return aptitud;
    }

    public void setAptitud(String aptitud) {
        this.aptitud = aptitud;
    }

    
    
}
