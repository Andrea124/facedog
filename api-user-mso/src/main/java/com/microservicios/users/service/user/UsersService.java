package com.microservicios.users.service.user;

import com.microservicios.users.entity.Users;

public interface UsersService {

	Users saveUser(Users id);

	Users seachUser(String id);

	void deteleUser(String id);

}
