
package com.back.Portfolio.service;

import com.back.Portfolio.model.Educacion;
import java.util.List;


public interface IEducacionService {

    public void crearEducacion(Educacion est);

    public List<Educacion> verEducaciones();

    public void borrarEducacion(Long id);

    public Educacion buscarEducacion(Long id);
    
    public void editarEducacion(Educacion est);

    public Educacion getOne(Long id);
}
