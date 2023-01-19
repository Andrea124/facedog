package com.microservicios.users.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.microservicios.users.entity.Users;

public interface UserRepository extends JpaRepository<Users, String> {

	Optional<Users> findById(@Param("id") String id);
}
