
package com.prueba4.Sprintboot4.repository;

import com.prueba4.Sprintboot4.model.ExperienciaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
 public interface  IExperienciaRepository  extends JpaRepository <ExperienciaModel, Long>{

    
        
    }

