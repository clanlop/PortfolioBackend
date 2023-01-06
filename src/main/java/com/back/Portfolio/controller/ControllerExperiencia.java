
package com.back.Portfolio.controller;

import com.back.Portfolio.model.Experiencia;
import com.back.Portfolio.service.IExperienciaService;
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
@RequestMapping("experiencia")
@CrossOrigin(origins="http://localhost 4200")
public class ControllerExperiencia {
   @Autowired 
   private IExperienciaService expeServ;
   
    @PostMapping("/crear")
    public String crearExperiencia(@RequestBody Experiencia exper){
    expeServ.crearExperiencia(exper);
    return "La experiencia fue creada correctamente";
    }
    @GetMapping("/lista")
    @ResponseBody
    public List <Experiencia>verExperiencias(){
        //return listaExperiencia;
        return expeServ.verExperiencias();
    }
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Experiencia>getById(@PathVariable("id")Long id){
        Experiencia exper=expeServ.getOne(id);
        return new ResponseEntity(exper,HttpStatus.OK);
    }
    @DeleteMapping("/borrar/{id}")
    public String borrarExperiencia(@PathVariable Long id){
        expeServ.borrarExperiencia(id);
        return "La experiencia fue borrada correctamente";
        
    }
    @PutMapping("/editar/{id}")
    public Experiencia editarExperiencia(@PathVariable Long id,
            @RequestParam("empresa")String nuevoEmpresa,
            @RequestParam("puesto")String nuevoPuesto,
            @RequestParam("descripcion")String nuevoDescripcion,
            @RequestParam("inicio")String nuevoInicio,
            @RequestParam("fin")String nuevoFin){
        
       Experiencia exp= expeServ.buscarExperiencia(id);
       exp.setEmpresa(nuevoEmpresa);
       exp.setPuesto(nuevoPuesto);
       exp.setDescripcion(nuevoDescripcion);
       exp.setInicio(nuevoInicio);
       exp.setFin(nuevoFin);
       expeServ.crearExperiencia(exp);
       return exp;
    }
}
