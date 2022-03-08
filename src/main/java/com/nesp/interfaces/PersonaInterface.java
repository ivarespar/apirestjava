/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nesp.interfaces;

import com.nesp.modelo.Persona;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nespdesktop
 */
public interface PersonaInterface {
    public List<Map<String,Object>>listar();
    public List<Map<String,Object>>listar(int id);
    public Persona add(Persona p);
    public Persona edit(Persona p);
    public void delete(int id);
    
}
