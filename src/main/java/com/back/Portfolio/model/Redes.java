
package com.back.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Redes {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    
    private String icono;
    private String nombre;
    private String url;

    public Redes( String icono, String nombre, String url) {
      
        this.icono = icono;
        this.nombre = nombre;
        this.url = url;
    }

    public Redes() {
    }
    
}
