
package com.prueba4.Sprintboot4.service;

import com.prueba4.Sprintboot4.model.EducacionModel;
import com.prueba4.Sprintboot4.repository.IEducacionRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    
     @Autowired  
    public IEducacionRepository ieduRepository; 

    
    public List<EducacionModel> getEducacion() {
        List<EducacionModel>  listaEducaciones = ieduRepository.findAll();
        return listaEducaciones;
    }

    public void crearEducacion(EducacionModel edu) {
        ieduRepository.save(edu);
   }

 
    public void deleteEducacion(Long id) {
        ieduRepository.deleteById(id);
  }

  
    public EducacionModel findEducacion(Long id) {
          EducacionModel  edu = ieduRepository.findById(id).orElse(null);
          return edu;
    }
          
           public void editEducacion(EducacionModel edu) {
        ieduRepository.save(edu);
   }
}
