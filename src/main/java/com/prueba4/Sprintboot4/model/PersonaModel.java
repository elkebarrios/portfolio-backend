
package com.prueba4.Sprintboot4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;



@Entity
public class PersonaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String imagen;
    private String banner;
    private String nombreperfil;
    private String tituloperfil;
    @Lob
    private String acercaDeMi;

    //alt + insert para abrir el menú y agregar constructor y getters y setter
    //constructor vacío
     public PersonaModel() {
    }
    
     //constructor con parametros

    public PersonaModel(String imagen, String banner, String nombreperfil, String tituloperfil, String acercaDeMi) {
        this.imagen = imagen;
        this.banner = banner;
        this.nombreperfil = nombreperfil;
        this.tituloperfil = tituloperfil;
        this.acercaDeMi = acercaDeMi;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }
    
        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombreperfil() {
        return nombreperfil;
    }

    public void setNombreperfil(String nombreperfil) {
        this.nombreperfil = nombreperfil;
    }

    public String getTituloperfil() {
        return tituloperfil;
    }

    public void setTituloperfil(String tituloperfil) {
        this.tituloperfil = tituloperfil;
    }

    public String getAcercaDeMi() {
        return acercaDeMi;
    }

    public void setAcercaDeMi(String acercaDeMi) {
        this.acercaDeMi = acercaDeMi;
    }

    
   
    
}
