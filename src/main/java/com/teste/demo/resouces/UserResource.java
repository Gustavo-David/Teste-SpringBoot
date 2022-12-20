package com.teste.demo.resouces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.demo.Entities.User;
@RestController
@RequestMapping(value = "/users")

public class UserResource {
    @GetMapping
    public ResponseEntity<User> findALL(){
        
        User u =new User(1L,"Maria","maria@gmail.com","999999","12345");
        return ResponseEntity.ok().body(u);
        
    }
}
