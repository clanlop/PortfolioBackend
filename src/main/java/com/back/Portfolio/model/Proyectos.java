
package com.back.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String url;
    
    private String inicio;
      
    private String fin;
    private String descripcion;

    public Proyectos(String url, String inicio, String fin, String descripcion) {
        this.url = url;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
    }

    public Proyectos() {
    }

    
    
}
