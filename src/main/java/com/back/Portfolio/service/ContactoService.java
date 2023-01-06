
package com.back.Portfolio.service;

import com.back.Portfolio.model.Contacto;
import com.back.Portfolio.repository.ContactoRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ContactoService implements IContactoService{
@Autowired
public ContactoRepository ContRepo;
    @Override
    public List<Contacto> verContactos() {
        List <Contacto>listaContactos=ContRepo.findAll();
        return listaContactos; 
    }
     @Override
    public void crearContacto(Contacto cont) {
        ContRepo.save(cont);
    }

    @Override
    public void borrarContacto(Long id) {
        ContRepo.deleteById(id);
    }
    @Override
    public Contacto buscarContacto(Long id) {
    Contacto cont= ContRepo.findById(id).orElse(null);
       return cont;
    }
    @Override
    public void editarContacto(Contacto cont) {
        ContRepo.save(cont);
    }

    @Override
    public Contacto getOne(Long id) {
         Contacto cont= ContRepo.findById(id).orElse(null);
       return cont;
    }

}