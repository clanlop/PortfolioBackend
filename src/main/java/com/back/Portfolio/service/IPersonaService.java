
package com.back.Portfolio.service;

import com.back.Portfolio.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona>verPersonas();
    
    public void crearPersona(Persona per);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona(Long id);
    
    public void editarPersona(Persona per);

    public Persona findPersona(Long id);

    public void savePersona(Persona per);

    public Persona getOne(Long id);
}
