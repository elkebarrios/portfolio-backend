
package com.prueba4.Sprintboot4.repository;

import com.prueba4.Sprintboot4.model.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface  IPersonaRepository extends JpaRepository<PersonaModel, Long> {
    
   
    
}
