package com.example.demo.repository;

import com.example.demo.model.productoModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productoRepository extends JpaRepository <productoModel, Integer>{
    
}
