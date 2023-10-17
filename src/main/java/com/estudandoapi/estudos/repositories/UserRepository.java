package com.estudandoapi.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandoapi.estudos.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{


}
