
package com.prueba4.Sprintboot4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RedModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    
    private Long id;
    private String link;
    private String icono;

    public RedModel() {
    }
    
    
    public RedModel(Long id, String link, String icono) {
        this.id = id;
        this.link = link;
        this.icono = icono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }
   
    
    
}
