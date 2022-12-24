
package com.prueba4.Sprintboot4.service;

import com.prueba4.Sprintboot4.model.PersonaModel;
import com.prueba4.Sprintboot4.repository.IPersonaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService {
 
    @Autowired
    
    IPersonaRepository ipersonaRepository;

    
    public List<PersonaModel> getPersona() {
        List<PersonaModel>  listaPersonas = ipersonaRepository.findAll();
        return listaPersonas;
    }

    public void crearPersona(PersonaModel per) {
        ipersonaRepository.save(per);
   }

 
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
  }

  
    public PersonaModel findPersona(Long id) {
          PersonaModel  perso = ipersonaRepository.findById(id).orElse(null);
          return perso;
   }
}

    