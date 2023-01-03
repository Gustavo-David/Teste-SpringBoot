package com.teste.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.demo.Entities.Category;
import com.teste.demo.repositories.CategoryRepository;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository repository;

    public Category findById(Long id){
         Optional<Category> obj = repository.findById(id);
         return obj.get();
    }
    public List<Category> findAll() {

        return repository.findAll();
    }
}
