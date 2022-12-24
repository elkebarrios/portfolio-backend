
package com.prueba4.Sprintboot4.controller;

import com.prueba4.Sprintboot4.model.ProyectoModel;
import com.prueba4.Sprintboot4.service.ProyectoService;
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
@RequestMapping("proyecto")//localhost:8080/proyecto/
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    
    @Autowired
    ProyectoService proServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<ProyectoModel> verProyectos() {
        return proServ.getProyecto();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public ProyectoModel verProyecto(@PathVariable Long id){
        return proServ.findProyecto(id);
    }
    

    @PostMapping("/new")
    public String agregarProyecto(@RequestBody ProyectoModel pro) {
        proServ.crearProyecto(pro);
        return "El proyecto fue agregado correctamente";
    }

    @DeleteMapping("/delete/{id}")
    public String eliminarProyecto(@PathVariable Long id) {
        proServ.deleteProyecto(id);
        return "El proyecto fue borrado correctamente";
 }
    
    @PutMapping("/update")
    public void updateProyecton(@RequestBody ProyectoModel pro){
        proServ.crearProyecto(pro);
    }
}
