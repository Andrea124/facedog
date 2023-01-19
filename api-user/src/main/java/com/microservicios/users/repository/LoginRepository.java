package com.microservicios.users.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.microservicios.users.entity.Login;

public interface LoginRepository extends JpaRepository<Login, String> {

	Optional<Login> findById(@Param("id") String id);
}
