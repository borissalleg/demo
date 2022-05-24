package com.example.demo.controller;

import com.example.demo.service.productoServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping(value = "/producto")
public class productoController {
   
    @Autowired
    private productoServiceImp producto;
    private Model addAttribute;



    @GetMapping(value = "/listar")
  public String ListarProductos(Model model){
    
    addAttribute = model.addAttribute("listaproducto", producto.retornarProductos());
     return "productos";
  }
    
}
