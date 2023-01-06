
package com.back.Portfolio.controller;

import com.back.Portfolio.model.Redes;
import com.back.Portfolio.service.IRedesService;
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
@RequestMapping("redes")
@CrossOrigin(origins="http://localhost 4200")
public class ControllerRedes {
    @Autowired
    private IRedesService redServ;
     @PostMapping("/crear")
    public String crearRedes(@RequestBody Redes reds){
    redServ.crearRedes(reds);
    return "La red fue creada correctamente";
    }
    @GetMapping("/lista")
    @ResponseBody
    public List <Redes>verRedes(){
        //return listaRedes;
        return redServ.verRedes();
    }
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Redes>getById(@PathVariable("id")Long id){
        Redes red=redServ.getOne(id);
        return new ResponseEntity(red,HttpStatus.OK);
    }
    
    @DeleteMapping("/borrar/{id}")
    public String borrarRedes(@PathVariable Long id){
        redServ.borrarRedes(id);
        return "La red fue borrada correctamente";
        
    }
    @PutMapping("/editar/{id}")
    public Redes editarRedes(@PathVariable Long id,
            @RequestParam("icono")String nuevoIcono,
            @RequestParam("nombre")String nuevoNombre,
            @RequestParam("url")String nuevoUrl)
    {
        
       Redes red= redServ.buscarRedes(id);
       red.setNombre(nuevoNombre);
       red.setUrl(nuevoUrl);
       red.setIcono(nuevoIcono);
       redServ.crearRedes(red);
       return red;
    }
}
