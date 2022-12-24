
package com.prueba4.Sprintboot4.controller;

import com.prueba4.Sprintboot4.model.RedModel;
import com.prueba4.Sprintboot4.service.RedService;
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
@RequestMapping("red")//localhost:8080/red/
@CrossOrigin(origins = "http://localhost:4200")

public class RedController {
      @Autowired
    RedService redServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<RedModel> verRedes() {
        return redServ.getRed();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public RedModel verRed(@PathVariable Long id){
        return redServ.findEducacion(id);
    }
    

    @PostMapping("/new")
    public String agregaRed(@RequestBody RedModel red) {
        redServ.crearRed(red);
        return "La red fue agregada correctamente";
    }

    @DeleteMapping("/delete/{id}")
    public String eliminarRed(@PathVariable Long id) {
        redServ.deleteRed(id);
        return "La red fue borrada correctamente";
 }
    
    @PutMapping("/update")
    public void updateRed(@RequestBody RedModel red){
        redServ.crearRed(red);
    }
    
}
