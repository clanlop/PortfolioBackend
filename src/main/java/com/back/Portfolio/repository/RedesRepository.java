
package com.back.Portfolio.repository;

import com.back.Portfolio.model.Redes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RedesRepository extends JpaRepository<Redes,Long> {
    
}
