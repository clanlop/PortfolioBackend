
package com.back.Portfolio.controller;

import com.back.Portfolio.model.Contacto;
import com.back.Portfolio.service.IContactoService;
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
@RequestMapping("contacto")
@CrossOrigin(origins="http://localhost 4200")
public class ControllerContacto {
    @Autowired
    private IContactoService ContServ;
    @PostMapping("/crear")
    public String crearContacto(@RequestBody Contacto cont){
    ContServ.crearContacto(cont);
    return "El contacto fue creado correctamente";
    }
    @GetMapping("/lista")
    @ResponseBody
    public List <Contacto>verContactos(){
       return ContServ.verContactos();
    }
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Contacto>getById(@PathVariable("id")Long id){
        Contacto cont=ContServ.getOne(id);
        return new ResponseEntity(cont,HttpStatus.OK);
    }
    @DeleteMapping("/borrar/{id}")
    public String borrarContacto(@PathVariable Long id){
        ContServ.borrarContacto(id);
        return "El contacto fue borrado correctamente";
        
    }
    @PutMapping("/editar/{id}")
    public Contacto editarContacto(@PathVariable Long id,
            @RequestParam("celu")String nuevoCelu,
            @RequestParam("email")String nuevoEmail){
        
       Contacto cont = ContServ.buscarContacto(id);
      cont.setCelu(nuevoCelu);
       cont.setEmail(nuevoEmail);
       ContServ.crearContacto(cont);
       return cont;
    }
}
