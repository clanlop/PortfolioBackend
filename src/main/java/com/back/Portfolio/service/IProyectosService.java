
package com.back.Portfolio.service;

import com.back.Portfolio.model.Proyectos;
import java.util.List;

public interface IProyectosService {

    public void crearProyectos(Proyectos pros);

    public List<Proyectos> verProyectoss();

    public void borrarProyectos(Long id);

    public Proyectos buscarProyectos(Long id);

    public Proyectos getOne(Long id);

    public List<Proyectos> verProyectos();
    
}
