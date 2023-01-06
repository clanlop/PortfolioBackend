
package com.back.Portfolio.service;

import com.back.Portfolio.model.Redes;
import com.back.Portfolio.repository.RedesRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RedesService implements IRedesService{
@Autowired
public RedesRepository RedRepo;
    @Override
    public List<Redes> verRedes() {
        List <Redes>listaRedes=RedRepo.findAll();
        return listaRedes; 
    }
    @Override
    public void crearRedes(Redes reds) {
      RedRepo.save(reds);  
    }

    @Override
    public void borrarRedes(Long id) {
        RedRepo.deleteById(id);
    }

    @Override
    public Redes buscarRedes(Long id) {
        Redes red= RedRepo.findById(id).orElse(null);
         return red;
    }
    
    public void editarRedes(Redes reds) {
      RedRepo.save(reds);  
    }

    @Override
    public Redes getOne(Long id) {
        Redes red= RedRepo.findById(id).orElse(null);
         return red;
    }

    
}
