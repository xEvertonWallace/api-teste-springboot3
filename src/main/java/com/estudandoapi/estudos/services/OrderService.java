package com.estudandoapi.estudos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudandoapi.estudos.entities.Order;
import com.estudandoapi.estudos.repositories.OrderRepository;
//classe é instanciada no OrderResource ao qual utiliza os metodos crud da api
@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	//retorna todos os usuarios
	public List<Order> findAll(){
		return repository.findAll();
		}
	//busca os usuarios passando o paramentro de id
	public Order findByI(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();	}
}
