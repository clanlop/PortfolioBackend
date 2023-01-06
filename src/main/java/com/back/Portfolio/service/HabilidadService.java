
package com.back.Portfolio.service;

import com.back.Portfolio.model.Habilidad;
import com.back.Portfolio.repository.HabilidadRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HabilidadService implements IHabilidadService {
@Autowired
public HabilidadRepository HabilidadRepo;
    @Override
    public List<Habilidad> verHabilidades() {
      List <Habilidad>listaHabilidades=HabilidadRepo.findAll();
        return listaHabilidades;   
    }

    @Override
    public void crearHabilidad(Habilidad hab) {
       HabilidadRepo.save(hab); 
    }

    @Override
    public void borrarHabilidad(Long id) {
        HabilidadRepo.deleteById(id);
    }

    @Override
    public Habilidad buscarHabilidad(Long id) {
        Habilidad hab= HabilidadRepo.findById(id).orElse(null);
         return hab;
    }

    @Override
    public void editarHabilidad(Habilidad hab) {
       HabilidadRepo.save(hab); 
    }

    @Override
    public Object getOne(Long id) {
        Habilidad hab= HabilidadRepo.findById(id).orElse(null);
         return hab;
    }

    @Override
    public Habilidad findHabilidad(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveHabilidad(Habilidad hab) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Habilidad> listaHabilidades() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean existsById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
