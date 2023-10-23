package com.estudandoapi.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudandoapi.estudos.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{


}
