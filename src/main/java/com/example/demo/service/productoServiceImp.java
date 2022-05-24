package com.example.demo.service;

import java.util.List;

import com.example.demo.model.productoModel;
import com.example.demo.repository.productoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productoServiceImp implements IProductoService {
   
    @Autowired
    private productoRepository pr;
   
    @Override
    public productoModel saveProducto(productoModel producto) {
     
        return pr.save(producto);
    }

    @Override
    public List<productoModel> retornarProductos() {
        
        return pr.findAll();
    }

    @Override
    public void deleteProducto(int id) {
       pr.deleteById(id);
        
    }

    @Override
    public productoModel updateProducto(productoModel producto) {
           
        return pr.save(producto);
    }

    @Override
    public productoModel buscarProducto(int id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
