
package com.back.Portfolio.service;

import com.back.Portfolio.model.Persona;
import com.back.Portfolio.repository.PersonaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional

public class PersonaService implements IPersonaService{
@Autowired
public PersonaRepository PersoRepo;
    @Override
    public List<Persona> verPersonas() {
        List <Persona>listaPersonas=PersoRepo.findAll();
        return listaPersonas; 
    }

    @Override
    public void crearPersona(Persona per) {
        PersoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        PersoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        Persona pers= PersoRepo.findById(id).orElse(null);
         return pers;
    }

    @Override
    public void editarPersona(Persona per) {
        PersoRepo.save(per);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona per= PersoRepo.findById(id).orElse(null);
         return per;
    }

    @Override
    public void savePersona(Persona per) {
        PersoRepo.save(per);
    }

    @Override
    public Persona getOne(Long id) {
        Persona per= PersoRepo.findById(id).orElse(null);
         return per;
        
    }
    
}
