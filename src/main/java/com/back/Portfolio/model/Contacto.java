
package com.back.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Contacto {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String celu;
    private String email;

    public Contacto(String celu, String email) {
        
        this.celu = celu;
        this.email = email;
    }

    public Contacto() {
    }
    
}
