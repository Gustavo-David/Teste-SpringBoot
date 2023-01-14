package com.teste.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.demo.Entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{
    
}
