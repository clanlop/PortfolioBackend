
package com.back.Portfolio.service;

import com.back.Portfolio.model.Proyectos;
import com.back.Portfolio.repository.ProyectosRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectosService implements IProyectosService {
    @Autowired
public ProyectosRepository ProyecRepo;

    @Override
    public List<Proyectos> verProyectos() {
      List <Proyectos>listaProyectos=ProyecRepo.findAll();
        return listaProyectos;  
    }
    @Override
    public void crearProyectos(Proyectos pro) {
        ProyecRepo.save(pro);
    }

    @Override
    public void borrarProyectos(Long id) {
        ProyecRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyectos(Long id) {
       Proyectos pro= ProyecRepo.findById(id).orElse(null);
         return pro;
    }
  
    public void editarProyectos(Proyectos pro) {
        ProyecRepo.save(pro);
}

     @Override
    public Proyectos getOne(Long id) {
        Proyectos pro= ProyecRepo.findById(id).orElse(null);
         return pro;
    }

    @Override
    public List<Proyectos> verProyectoss() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}