
package com.back.Portfolio.controller;

import com.back.Portfolio.model.Proyectos;
import com.back.Portfolio.service.IProyectosService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("proyectos")
@CrossOrigin(origins="http://localhost 4200")
public class ControllerProyectos {
     @Autowired
     private IProyectosService proyecServ;
     @PostMapping("/crear")
    public String crearProyectos(@RequestBody Proyectos pros){
    proyecServ.crearProyectos(pros);
    return "El proyecto fue creado correctamente";
    }
    @GetMapping("/lista")
    @ResponseBody
    public List <Proyectos>verProyectos(){
        //return listaProyectos;
        return proyecServ.verProyectos();
    }
     @GetMapping("/buscar/{id}")
    public ResponseEntity<Proyectos>getById(@PathVariable("id")Long id){
        Proyectos pro= proyecServ.getOne(id);
        return new ResponseEntity(pro,HttpStatus.OK);
    }
    @DeleteMapping("/borrar/{id}")
    public String borrarProyectos(@PathVariable Long id){
        proyecServ.borrarProyectos(id);
        return "El proyecto fue borrado correctamente";
        
    }
    @PutMapping("/editar/{id}")
    public Proyectos editarProyectos(@PathVariable Long id,
            @RequestParam("url")String nuevoUrl,
            @RequestParam("inicio")String nuevoInicio,
            @RequestParam("fin")String nuevoFin,
            @RequestParam("descripcion")String nuevoDescripcion)
    {
        
       Proyectos pro= proyecServ.buscarProyectos(id);
       pro.setUrl(nuevoUrl);
       pro.setInicio(nuevoInicio);
       pro.setFin(nuevoFin);
       pro.setDescripcion(nuevoDescripcion);
       proyecServ.crearProyectos(pro);
       return pro;
    }
}
