
package com.back.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String empresa;
    private String puesto;
    private String descripcion;
    
    private String inicio;
    
    private String fin;

    public Experiencia(String empresa, String puesto, String descripcion, String inicio, String fin) {
        this.empresa = empresa;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.inicio = inicio;
        this.fin = fin;
    }

    public Experiencia() {
    }

    
    }

    

    
    

    
    
    

