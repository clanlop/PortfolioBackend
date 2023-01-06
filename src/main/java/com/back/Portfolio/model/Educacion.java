
package com.back.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nivel;
    private String institucion;
    private String titulo;
    
    private String egreso;
    private String img_titulo;

    public Educacion(String nivel, String institucion, String titulo, String egreso, String img_titulo) {
        this.nivel = nivel;
        this.institucion = institucion;
        this.titulo = titulo;
        this.egreso = egreso;
        this.img_titulo = img_titulo;
    }

    public Educacion() {
    }

    
    
    
}
