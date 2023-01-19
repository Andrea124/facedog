package com.microservicios.users.api;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;

import java.util.List;

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

import com.microservicios.users.entity.Dates;
import com.microservicios.users.service.user.DateServiceImpl;

@RestController
@RequestMapping("api/dates")
public class DateController {

	private static final Logger log = Logger.getLogger(DateController.class);
	@Autowired
	private DateServiceImpl DateService;

	@GetMapping("/{username}")
	@ResponseStatus(OK)
	public List<Dates> leer(@PathVariable("username") String username) {
		log.info(">>> seach dates");

		return DateService.seachDate(username);
	}

	@PostMapping
	@ResponseStatus(CREATED)
	public Dates crear(@RequestBody Dates date) {
		log.info(">>> create date");
		return DateService.saveDate(date);
	}

}
