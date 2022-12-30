package com.teste.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.demo.Entities.Order;
import com.teste.demo.repositories.OrderRepository;

@Service
public class OrderServices {

    @Autowired
    private OrderRepository repository;

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

    public List<Order> findAll() {

        return repository.findAll();
    }
}
