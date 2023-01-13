
package com.prueba4.Sprintboot4.controller;

import com.prueba4.Sprintboot4.model.PersonaModel;
import com.prueba4.Sprintboot4.service.PersonaService;
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
@RequestMapping("persona")//localhost:8080/persona/
@CrossOrigin(origins = "https://portfolioelkebarrios.web.app")
//@CrossOrigin(origins = "http://localhost:4200")

public class PersonaController {
    
    @Autowired
    PersonaService persoServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<PersonaModel> verPersonas() {
        return persoServ.getPersona();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public PersonaModel verPersona(@PathVariable Long id){
        return persoServ.findPersona(id);
    }
    

    @PostMapping("/new")
    public ResponseEntity agregarPersona(@RequestBody PersonaModel pers) {
        persoServ.crearPersona(pers);
        return ResponseEntity.ok().body(pers);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity eliminarPersona(@PathVariable Long id) {
        persoServ.deletePersona(id);
        return new ResponseEntity(HttpStatus.OK);
 }
    
    @PutMapping("/update")
    public ResponseEntity updatePersona(@RequestBody PersonaModel pers){
        persoServ.crearPersona(pers);
        return new ResponseEntity(HttpStatus.OK);
    }
    
/*@PutMapping("/persona/editar/{id}")
    public PersonaModel editPersona (@PathVariable Long id,
            @RequestParam ("imagen") String nuevoImagenes,
            @RequestParam ("nombreperfil") String nuevoAnio,
            @RequestParam ("tituloperfil") String nuevoApellido,
            @RequestParam ("acercaDeMi") String nuevoDescripcion,
PersonaModel perso = persoServ.editPersona(id);
        
        perso.setNombre(nuevoNombre);
        String nuevasImagenes = null;
        perso.setImagenes(nuevasImagenes);
     
     
        perso.setAnio(nuevoAnio);
     
        perso.setDescripcion(nuevoDescripcion);
     
        perso.setTitulo(nuevoTitulo);
        
        return perso;
    }*/
}