package com.microservicios.users.service.user;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicios.users.entity.Login;
import com.microservicios.users.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

	private static final Logger log = Logger.getLogger(LoginServiceImpl.class);
	@Autowired
	private LoginRepository userRepository;

	@Override
	public Login saveUser(Login userEntity) {
		return userRepository.save(userEntity);
	}
	

	@Override
	public Login seachUser(String id) {

		return userRepository.findById(id)
				.orElseThrow(() -> new LoginException("No se encontro el usuario : " , id));
	}

	@Override
	public void deteleUser(String id) {

		Login users = userRepository.findById(id)
				.orElseThrow(() -> new LoginException("No se encontro el usuario : " ,id));

		userRepository.delete(users.getId());
	}

}
