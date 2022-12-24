
package com.prueba4.Sprintboot4.service;

import com.prueba4.Sprintboot4.model.ProyectoModel;
import com.prueba4.Sprintboot4.repository.IProyectoRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ProyectoService {
    
     @Autowired  
    public IProyectoRepository iproRepository; 

    
    public List<ProyectoModel> getProyecto() {
        List<ProyectoModel>  listaProyectos = iproRepository.findAll();
        return listaProyectos;
    }

    public void crearProyecto(ProyectoModel pro) {
        iproRepository.save(pro);
   }

 
    public void deleteProyecto(Long id) {
        iproRepository.deleteById(id);
  }

  
    public ProyectoModel findProyecto(Long id) {
          ProyectoModel  pro = iproRepository.findById(id).orElse(null);
          return pro;
    }
          
           public void editProyecto(ProyectoModel pro) {
        iproRepository.save(pro);
   }
}
