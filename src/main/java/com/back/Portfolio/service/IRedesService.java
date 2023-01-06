
package com.back.Portfolio.service;

import com.back.Portfolio.model.Redes;
import java.util.List;


public interface IRedesService {

    public void crearRedes(Redes reds);

    public List<Redes> verRedes();

    public void borrarRedes(Long id);

    public Redes buscarRedes(Long id);

    public Redes getOne(Long id);
    
}
