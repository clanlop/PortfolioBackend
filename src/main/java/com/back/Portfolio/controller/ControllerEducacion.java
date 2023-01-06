
package com.back.Portfolio.controller;

import com.back.Portfolio.model.Educacion;
import com.back.Portfolio.service.IEducacionService;
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
@RequestMapping("educacion")
@CrossOrigin(origins="http://localhost 4200")
public class ControllerEducacion {
    @Autowired
    private IEducacionService eduServ;
    
     @PostMapping("/crear")
    public String crearEducacion(@RequestBody Educacion est){
    eduServ.crearEducacion(est);
    return "La educacion fue creada correctamente";
    }
    @GetMapping("/lista")
    @ResponseBody
    public List <Educacion>verEducaciones(){
        //return listaEducacion;
        return eduServ.verEducaciones();
    }
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Educacion>getById(@PathVariable("id")Long id){
        Educacion edu=eduServ.getOne(id);
        return new ResponseEntity(edu,HttpStatus.OK);
    }
    @DeleteMapping("/borrar/{id}")
    public String borrarEducacion(@PathVariable Long id){
        eduServ.borrarEducacion(id);
        return "La educacion fue borrada correctamente";
        
    }
    @PutMapping("/editar/{id}")
    public Educacion editarEducacion(@PathVariable Long id,
            @RequestParam("nivel")String nuevoNivel,
            @RequestParam("institucion")String nuevoInstitucion,
            @RequestParam("titulo")String nuevoTitulo,
            @RequestParam("egreso")String nuevoEgreso,
            @RequestParam("img_titulo")String nuevaImg_titulo
            )
    
    {
      Educacion edu= eduServ.buscarEducacion(id);
       edu.setNivel(nuevoNivel);
       edu.setInstitucion(nuevoInstitucion);
       edu.setTitulo(nuevoTitulo);
        edu.setEgreso(nuevoEgreso);
       edu.setImg_titulo(nuevaImg_titulo);
       eduServ.crearEducacion(edu);
       return edu;
    }
}
