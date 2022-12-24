
package com.prueba4.Sprintboot4.service;

import com.prueba4.Sprintboot4.model.ExperienciaModel;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prueba4.Sprintboot4.repository.IExperienciaRepository;

@Service
@Transactional
public class ExperienciaService {
   
    @Autowired  
    public IExperienciaRepository iexpRepository; 

    
    public List<ExperienciaModel> getExperiencia() {
        List<ExperienciaModel>  listaExperiencias = iexpRepository.findAll();
        return listaExperiencias;
    }

    public void crearExperiencia(ExperienciaModel exp) {
        iexpRepository.save(exp);
   }

 
    public void deleteExperiencia(Long id) {
        iexpRepository.deleteById(id);
  }

  
    public ExperienciaModel findExperiencia(Long id) {
          ExperienciaModel  exp = iexpRepository.findById(id).orElse(null);
          return exp;
    }
          
           public void editExperiencia(ExperienciaModel exp) {
        iexpRepository.save(exp);
   }

    
   
   }  
    
    

