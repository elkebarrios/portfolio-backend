
package com.prueba4.Sprintboot4.controller;

import com.prueba4.Sprintboot4.model.ExperienciaModel;
import com.prueba4.Sprintboot4.service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity agregarExperiencia(@RequestBody ExperienciaModel exp) {
        expServ.crearExperiencia(exp);
        return ResponseEntity.ok().body(exp);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity eliminarExperiencia(@PathVariable Long id) {
        expServ.deleteExperiencia(id);
        return new ResponseEntity(HttpStatus.OK);
 }
    
    @PutMapping("/update")
    public ResponseEntity updateExperiencia(@RequestBody ExperienciaModel exp){
        expServ.crearExperiencia(exp);
        return new ResponseEntity(HttpStatus.OK);
    }
}
