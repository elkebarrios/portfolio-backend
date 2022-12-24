
package com.prueba4.Sprintboot4.service;

import com.prueba4.Sprintboot4.model.RedModel;
import com.prueba4.Sprintboot4.repository.IRedRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class RedService {
    
     @Autowired  
    public IRedRepository iredRepository; 

    
    public List<RedModel> getRed() {
        List<RedModel>  listaRedes = iredRepository.findAll();
        return listaRedes;
    }

    public void crearRed(RedModel red) {
        iredRepository.save(red);
   }

 
    public void deleteRed(Long id) {
        iredRepository.deleteById(id);
  }

  
    public RedModel findEducacion(Long id) {
          RedModel  red = iredRepository.findById(id).orElse(null);
          return red;
    }
          
           public void editRed(RedModel red) {
        iredRepository.save(red);
   }

    
}
