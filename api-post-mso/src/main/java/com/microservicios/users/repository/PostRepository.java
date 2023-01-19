package com.microservicios.users.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.microservicios.users.entity.Post;

public interface PostRepository extends JpaRepository<Post, String> {

	Optional<Post> findById(@Param("id") String id);
	//Optional<Post> findByUsername(@Param("username") String username);
	List<Post> findByUsername(@Param("username") String username);
}

