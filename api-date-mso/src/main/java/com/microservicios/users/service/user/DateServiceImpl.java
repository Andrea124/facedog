package com.microservicios.users.service.user;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicios.users.entity.Dates;
import com.microservicios.users.repository.DateRepository;

@Service
public class DateServiceImpl implements DateService {

	private static final Logger log = Logger.getLogger(DateServiceImpl.class);
	@Autowired
	private DateRepository dateRepository;

	@Override
	public Dates saveDate(Dates userEntity) {
		return dateRepository.save(userEntity);
	}
	

	@Override
	public List<Dates> seachDate(String username) {
		return dateRepository.findByUsername(username);
	}

}
