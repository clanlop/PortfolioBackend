
package com.back.Portfolio.repository;

import com.back.Portfolio.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto,Long> {

    
}
