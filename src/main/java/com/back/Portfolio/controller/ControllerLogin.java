
package com.back.Portfolio.controller;

import com.back.Portfolio.model.Login;
import com.back.Portfolio.service.ILoginService;
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
@RequestMapping("login")
@CrossOrigin(origins="http://localhost 4200")
public class ControllerLogin {
    @Autowired
    private ILoginService LogServ;
    @PostMapping("/crear")
    public String crearLogin(@RequestBody Login log){
    LogServ.crearLogin(log);
    return "El login fue creado correctamente";
    }
    @GetMapping("/lista")
    @ResponseBody
    public List <Login>verLogins(){
       return LogServ.verLogins();
    }
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Login>getById(@PathVariable("id")Long id){
        Login log=LogServ.getOne(id);
        return new ResponseEntity(log,HttpStatus.OK);
    }
    @DeleteMapping("/borrar/{id}")
    public String borrarLogin(@PathVariable Long id){
        LogServ.borrarLogin(id);
        return "El login fue borrado correctamente";
        
    }
    @PutMapping("/editar/{id}")
    public Login editarLogin(@PathVariable Long id,
            @RequestParam("password")String nuevoPassword,
            @RequestParam("email")String nuevoEmail){
        
       Login log = LogServ.buscarLogin(id);
      log.setPassword(nuevoPassword);
       log.setEmail(nuevoEmail);
       LogServ.crearLogin(log);
       return log;
    }
}
