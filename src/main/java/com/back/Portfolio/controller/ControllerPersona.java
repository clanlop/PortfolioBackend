
package com.back.Portfolio.controller;

import com.back.Portfolio.model.Persona;
import com.back.Portfolio.service.IPersonaService;
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
@RequestMapping("persona")
@CrossOrigin(origins="http://localhost 4200")
public class ControllerPersona {
     @Autowired
    private IPersonaService persoServ;
    @GetMapping("/lista")
    @ResponseBody
    public List <Persona>verPersonas(){
        return persoServ.verPersonas();
    }
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Persona>getById(@PathVariable("id")Long id){
        Persona pers=persoServ.getOne(id);
        return new ResponseEntity(pers,HttpStatus.OK);
    }
    
     
     @PostMapping("/crear")
    public String crearPersona(@RequestBody Persona pers){
    persoServ.crearPersona(pers);
    return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
        return "La persona fue borrada correctamente";
        
    }
    @PutMapping("/editar/{id}")
    public Persona editarPersona(@PathVariable Long id,
            @RequestParam("nombre")String nuevoNombre,
            @RequestParam("apellido")String nuevoApellido,
            @RequestParam("desarrollador")String nuevoDesarrollador,
            @RequestParam("acerca_de_mi")String nuevoAcerca_de_mi,
            @RequestParam("imgPerfil")String nuevoImgPerfil,
            @RequestParam("imgBanner")String nuevoImgBanner){
    
        
       Persona per= persoServ.buscarPersona(id);
       per.setNombre(nuevoNombre);
       per.setApellido(nuevoApellido);
       per.setDesarrollador(nuevoDesarrollador);
       per.setAcerca_de_mi(nuevoAcerca_de_mi);
       per.setImgPerfil(nuevoImgPerfil);
       per.setImgBanner(nuevoImgBanner);
       persoServ.crearPersona(per);
       return per;
    }
}
