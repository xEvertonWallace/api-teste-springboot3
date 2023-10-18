package com.estudandoapi.estudos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudandoapi.estudos.entities.User;
import com.estudandoapi.estudos.repositories.UserRepository;
//classe é instanciada no UserResource ao qual utiliza os metodos crud da api
@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	//retorna todos os usuarios
	public List<User> findAll(){
		return repository.findAll();
		}
	//busca os usuarios passando o paramentro de id
	public User findByI(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();	}
}
