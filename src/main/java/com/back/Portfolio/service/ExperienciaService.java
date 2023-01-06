
package com.back.Portfolio.service;

import com.back.Portfolio.model.Experiencia;
import com.back.Portfolio.repository.ExperienciaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService implements IExperienciaService{
  @Autowired  
public ExperienciaRepository ExpeRepo;
    @Override
    public List<Experiencia> verExperiencias() {
      List <Experiencia>listaPersonas=ExpeRepo.findAll();
        return listaPersonas;  
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        ExpeRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        ExpeRepo.deleteById(id);
    }
    
    public void editarExperiencia(Experiencia exp) {
        ExpeRepo.save(exp);
    }
    

    @Override
    public Experiencia buscarExperiencia(Long id) {
        Experiencia exper= ExpeRepo.findById(id).orElse(null);
         return exper;
    }

    @Override
    public Experiencia getOne(Long id) {
        Experiencia exp= ExpeRepo.findById(id).orElse(null);
         return exp;
    }
    public void savePersona(Experiencia exp) {
        ExpeRepo.save(exp);
    }
}
