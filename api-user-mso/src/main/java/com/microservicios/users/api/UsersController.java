package com.microservicios.users.api;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios.users.entity.Users;
import com.microservicios.users.service.user.UsersServiceImpl;

@RestController
@RequestMapping("api/user")
public class UsersController {

	private static final Logger log = Logger.getLogger(UsersController.class);
	@Autowired
	private UsersServiceImpl UserService;

	@GetMapping("/{id}")
	@ResponseStatus(OK)
	public Users leer(@PathVariable("id") String id) {
		log.info(">>> seach users");

		return UserService.seachUser(id);
	}

	@PostMapping
	@ResponseStatus(CREATED)
	public Users crear(@RequestBody Users cliente) {
		log.info(">>> create user");
		return UserService.saveUser(cliente);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(NO_CONTENT)
	public void borrar(@PathVariable("id") String id) {
		log.info(">>> delete user");
		UserService.deteleUser(id);
	}

}
