
package com.back.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
@Entity

public class Habilidad {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String habilidad;
    private int porcentaje;

    public Habilidad( String habilidad, int porcentaje) {
      
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
    }

    public Habilidad() {
    }

    
    }
