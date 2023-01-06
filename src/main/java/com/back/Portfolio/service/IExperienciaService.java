
package com.back.Portfolio.service;

import com.back.Portfolio.model.Experiencia;
import java.util.List;


public interface IExperienciaService {

    public List<Experiencia> verExperiencias();

    public void crearExperiencia(Experiencia exp);

    public void borrarExperiencia(Long id);

    public Experiencia buscarExperiencia(Long id);

    public Experiencia getOne(Long id);
    
}
