
package com.back.Portfolio.service;

import com.back.Portfolio.model.Educacion;
import com.back.Portfolio.repository.EducacionRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService implements IEducacionService{
 @Autowired
 public EducacionRepository EduRepo;
 
    @Override
    public List<Educacion> verEducaciones() {
        List <Educacion>listaEducaciones=EduRepo.findAll();
        return listaEducaciones; 
    }
    @Override
    public void crearEducacion(Educacion edu) {
        EduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        EduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
         Educacion edu= EduRepo.findById(id).orElse(null);
         return edu;
    }

    @Override
    public void editarEducacion(Educacion edu) {
       EduRepo.save(edu);
    }

    @Override
    public Educacion getOne(Long id) {
        Educacion edu= EduRepo.findById(id).orElse(null);
         return edu;
    }

   
}
