
package com.prueba4.Sprintboot4.controller;

import com.prueba4.Sprintboot4.model.HardSkillsModel;
import com.prueba4.Sprintboot4.service.HardSkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("hard")//localhost:8080/hard/
@CrossOrigin(origins = "http://localhost:4200")

public class HardSkillsController {
    @Autowired
            
    HardSkillsService hardServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<HardSkillsModel> verHards() {
        return hardServ.getHardSkills();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public HardSkillsModel verHard(@PathVariable Long id){
        return hardServ.findHardSkills(id);
    }
    

    @PostMapping("/new")
    public String agregarHard(@RequestBody HardSkillsModel hard) {
        hardServ.crearHardSkills(hard);
        return "La habilidad fue agregada correctamente";
    }

    @DeleteMapping("/delete/{id}")
    public String eliminarHard(@PathVariable Long id) {
        hardServ.deleteHardSkills(id);
        return "La habilidad fue borrada correctamente";
 }
    
    @PutMapping("/update")
    public void updateHard(@RequestBody HardSkillsModel hard){
        hardServ.crearHardSkills(hard);
    }
}
