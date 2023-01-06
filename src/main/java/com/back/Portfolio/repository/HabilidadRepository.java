
package com.back.Portfolio.repository;

import com.back.Portfolio.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface HabilidadRepository extends JpaRepository<Habilidad,Long> {
   
    
    
}
