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

import com.microservicios.users.entity.Login;
import com.microservicios.users.service.user.LoginServiceImpl;

@RestController
@RequestMapping("api/user")
public class LoginController {

	private static final Logger log = Logger.getLogger(LoginController.class);
	@Autowired
	private LoginServiceImpl UserService;

	@GetMapping("/{id}")
	@ResponseStatus(OK)
	public Login leer(@PathVariable("id") String id) {
		log.info(">>> seach users");

		return UserService.seachUser(id);
	}

	@PostMapping
	@ResponseStatus(CREATED)
	public Login crear(@RequestBody Login cliente) {
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
