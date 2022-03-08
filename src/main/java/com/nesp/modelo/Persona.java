/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nesp.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author nespdesktop
 */
@Entity
public class Persona {
    @Id
    private int id;
    private String nombres;
    private String apellidos;    
    
    public Persona(int id, String nombres, String apellidos) {
        super();
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    
}
