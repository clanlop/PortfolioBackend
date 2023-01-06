
package com.back.Portfolio.service;

import com.back.Portfolio.model.Contacto;
import java.util.List;


public interface IContactoService {

    public void crearContacto(Contacto cont);

    public List<Contacto> verContactos();

    public void borrarContacto(Long id);

    public Contacto buscarContacto(Long id);
    
    public void editarContacto(Contacto cont);

    public Contacto getOne(Long id);
    
    
    
}
