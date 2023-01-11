
package com.prueba4.Sprintboot4.controller;

import com.prueba4.Sprintboot4.model.EducacionModel;
import com.prueba4.Sprintboot4.service.EducacionService;
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
@RequestMapping("educacion")//localhost:8080/educacion/
@CrossOrigin(origins = "http://localhost:4200")

public class EducacionController {
    
    @Autowired
    EducacionService eduServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<EducacionModel> verEducaciones() {
        return eduServ.getEducacion();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public  EducacionModel verEducacion(@PathVariable Long id){
        return eduServ.findEducacion(id);
    }
    

    @PostMapping("/new")
    public ResponseEntity agregarEducacion(@RequestBody EducacionModel edu) {
        eduServ.crearEducacion(edu);
        return ResponseEntity.ok().body(edu);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity eliminarEducacion(@PathVariable Long id) {
        eduServ.deleteEducacion(id);
        return new ResponseEntity(HttpStatus.OK);
 }
    
    @PutMapping("/update")
    public ResponseEntity updateEducacion(@RequestBody EducacionModel edu){
        eduServ.crearEducacion(edu);
        return new ResponseEntity(HttpStatus.OK);
    }
}

