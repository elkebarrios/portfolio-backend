
package com.prueba4.Sprintboot4.controller;

import com.prueba4.Sprintboot4.model.ExperienciaModel;
import com.prueba4.Sprintboot4.service.ExperienciaService;
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
@RequestMapping("experiencia")//localhost:8080/experiencia/
@CrossOrigin(origins = "http://localhost:4200")

public class ExperienciaController {
    
      @Autowired
    ExperienciaService expServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<ExperienciaModel> verExperiencias() {
        return expServ.getExperiencia();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public ExperienciaModel verExperiencia(@PathVariable Long id){
        return expServ.findExperiencia(id);
    }
    

    @PostMapping("/new")
    public String agregarExperiencia(@RequestBody ExperienciaModel exp) {
        expServ.crearExperiencia(exp);
        return "La experiencia fue agregada correctamente";
    }

    @DeleteMapping("/delete/{id}")
    public String eliminarExperiencia(@PathVariable Long id) {
        expServ.deleteExperiencia(id);
        return "La experiencia fue borrada correctamente";
 }
    
    @PutMapping("/update")
    public void updateExperiencia(@RequestBody ExperienciaModel exp){
        expServ.crearExperiencia(exp);
    }
}
