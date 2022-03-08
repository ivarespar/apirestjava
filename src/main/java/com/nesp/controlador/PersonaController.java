/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nesp.controlador;

import com.nesp.service.PersonaService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nespdesktop
 */
@RestController
@RequestMapping("/personas")
public class PersonaController {
    
    @Autowired
    private PersonaService service;
    
    @GetMapping("/listar")
    public List<Map<String,Object>>listar(){
        List<Map<String,Object>> lista = service.listar();
        return lista;
    }
}
