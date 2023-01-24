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
    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public User update(Long id, User obj){
        User entity = repository.getReferenceById(id);
        updateData(entity,obj);

        return repository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
