
package com.prueba4.Sprintboot4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity

public class EducacionModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    
    private Long id;
    private String logoInstitucion;
    private String nombreInstitucion;
    private String tituloObtenido;
   @Temporal(TemporalType.DATE)
    private Date fechaFin;

    public EducacionModel() {
    }

    public EducacionModel(String logoInstitucion, String nombreInstitucion, String tituloObtenido, Date fechaFin) {
        this.logoInstitucion = logoInstitucion;
        this.nombreInstitucion = nombreInstitucion;
        this.tituloObtenido = tituloObtenido;
        this.fechaFin = fechaFin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogoInstitucion() {
        return logoInstitucion;
    }

    public void setLogoInstitucion(String logoInstitucion) {
        this.logoInstitucion = logoInstitucion;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getTituloObtenido() {
        return tituloObtenido;
    }

    public void setTituloObtenido(String tituloObtenido) {
        this.tituloObtenido = tituloObtenido;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
   
    

}
