package com.example.demo.service;

import java.util.List;

import com.example.demo.model.productoModel;

public interface IProductoService {
    
    productoModel saveProducto (productoModel producto);
    List<productoModel> retornarProductos();
    productoModel buscarProducto(int id);
    void deleteProducto(int id);
    productoModel updateProducto(productoModel producto);

}
