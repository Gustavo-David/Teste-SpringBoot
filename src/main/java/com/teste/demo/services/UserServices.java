package com.teste.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.demo.Entities.User;
import com.teste.demo.repositories.UserRepository;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;

    public User findById(Long id){
         Optional<User> obj = repository.findById(id);
         return obj.get();
    }
    public List<User> findAll() {

        return repository.findAll();
    }
}