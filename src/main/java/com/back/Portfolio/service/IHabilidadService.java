
package com.back.Portfolio.service;

import com.back.Portfolio.model.Habilidad;
import java.util.List;


public interface IHabilidadService {
    
    public List<Habilidad>verHabilidades();
    
    public void crearHabilidad(Habilidad hab);
    
    public void borrarHabilidad(Long id);
    
    public Habilidad buscarHabilidad(Long id);
    
    public void editarHabilidad(Habilidad hab);

    public Habilidad findHabilidad(Long id);

    public void saveHabilidad(Habilidad hab);

    public List<Habilidad> listaHabilidades();

    public boolean existsById(int id);

    public Object getOne(Long id);
}
