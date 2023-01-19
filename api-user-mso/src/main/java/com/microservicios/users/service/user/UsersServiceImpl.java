package com.microservicios.users.service.user;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicios.users.entity.Users;
import com.microservicios.users.repository.UserRepository;

@Service
public class UsersServiceImpl implements UsersService {

	private static final Logger log = Logger.getLogger(UsersServiceImpl.class);
	@Autowired
	private UserRepository userRepository;

	@Override
	public Users saveUser(Users userEntity) {
		return userRepository.save(userEntity);
	}
	

	@Override
	public Users seachUser(String id) {

		return userRepository.findById(id)
				.orElseThrow(() -> new UserException("No se encontro el usuario : " , id));
	}

	@Override
	public void deteleUser(String id) {

		Users users = userRepository.findById(id)
				.orElseThrow(() -> new UserException("No se encontro el usuario : " ,id));

		userRepository.delete(users.getId());
	}

}
