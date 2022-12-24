
package com.prueba4.Sprintboot4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProyectoModel {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
     
     private Long id;
    private String nombre;
    private String imagenes;
    private String descripcion;
    private String link;

    public ProyectoModel() {
    }

    public ProyectoModel(Long id, String nombre, String imagenes, String descripcion, String link) {
        this.id = id;
        this.nombre = nombre;
        this.imagenes = imagenes;
        this.descripcion = descripcion;
        this.link = link;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
   
}
