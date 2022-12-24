
package com.prueba4.Sprintboot4.service;


import com.prueba4.Sprintboot4.model.HardSkillsModel;
import com.prueba4.Sprintboot4.repository.IHardSkillsRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class HardSkillsService {
    
    @Autowired  
    public IHardSkillsRepository ihardRepository; 

    
    public List<HardSkillsModel> getHardSkills() {
        List<HardSkillsModel>  listaHards = ihardRepository.findAll();
        return listaHards;
    }

    public void crearHardSkills(HardSkillsModel hard) {
        ihardRepository.save(hard);
   }

 
    public void deleteHardSkills(Long id) {
        ihardRepository.deleteById(id);
  }

  
    public HardSkillsModel findHardSkills(Long id) {
          return ihardRepository.findById(id).orElse(null);
    }
          
           public void editHardSkills(HardSkillsModel hard) {
        ihardRepository.save(hard);
                
}
}
