package com.teste.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.demo.Entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
