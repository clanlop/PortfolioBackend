
package com.back.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private String desarrollador;
    @Lob
    private String acerca_de_mi;
    private String imgPerfil;
    private String imgBanner;

    public Persona(String nombre, String apellido, String desarrollador, String acerca_de_mi, String imgPerfil, String imgBanner) {
       
        this.nombre = nombre;
        this.apellido = apellido;
        this.desarrollador = desarrollador;
        this.acerca_de_mi = acerca_de_mi;
        this.imgPerfil = imgPerfil;
        this.imgBanner = imgBanner;
    }

    public Persona() {
    }
   

   
    
}