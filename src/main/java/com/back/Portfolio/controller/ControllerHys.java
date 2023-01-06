
package com.back.Portfolio.controller;

import com.back.Portfolio.model.Habilidad;
import com.back.Portfolio.service.IHabilidadService;
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
@RequestMapping("habilidad")
@CrossOrigin(origins="http://localhost 4200")
public class ControllerHys {
    @Autowired
    private IHabilidadService habiServ;
     
     @PostMapping("/crear")
    public String crearHabilidad(@RequestBody Habilidad hab){
    habiServ.crearHabilidad(hab);
    return "La habilidad fue creada correctamente";
    }
    @GetMapping("/lista")
    @ResponseBody
    public List <Habilidad>verHabilidades(){
        //return listaHabilidad;
        return habiServ.verHabilidades();
    }
    
    @GetMapping("/buscar/{id}")
    public ResponseEntity <Habilidad>getById(@PathVariable("id")Long id){
        Habilidad habilidad=(Habilidad) habiServ.getOne(id);
        return new ResponseEntity(habilidad,HttpStatus.OK);
    }
    
    @DeleteMapping("/borrar/{id}")
    public String borrarHabilidad(@PathVariable Long id){
        habiServ.borrarHabilidad(id);
        return "La habilidad fue borrada correctamente";
        
    }
    @PutMapping("/editar/{id}")
    public Habilidad editarHabilidad(@PathVariable Long id,
            @RequestParam("habilidad")String nuevaHabilidad,
            @RequestParam("porcentaje")int nuevoPorcentaje){
        
       Habilidad hab= habiServ.buscarHabilidad(id);
       hab.setHabilidad(nuevaHabilidad);
       hab.setPorcentaje(nuevoPorcentaje);
       habiServ.crearHabilidad(hab);
       return hab;
    }
}
