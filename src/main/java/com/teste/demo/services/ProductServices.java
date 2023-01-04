package com.teste.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.demo.Entities.Product;
import com.teste.demo.repositories.ProductRepository;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository repository;

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

    public List<Product> findAll() {

        return repository.findAll();
    }
}
