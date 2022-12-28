package com.teste.demo.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.demo.Entities.User;
import com.teste.demo.services.UserServices;

@RestController
@RequestMapping(value = "/users")

public class UserResource {

    @Autowired
    private UserServices service;

    @GetMapping
    public ResponseEntity<List<User>> findALL(){
        
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
        
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        
        return ResponseEntity.ok().body(obj);
    }

}
