package com.microservicios.users.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.microservicios.users.entity.Dates;

public interface DateRepository extends JpaRepository<Dates, String> {

	Optional<Dates> findById(@Param("username") String username);
	List<Dates> findByUsername(@Param("username") String username);
}
