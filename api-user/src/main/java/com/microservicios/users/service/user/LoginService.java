package com.microservicios.users.service.user;

import com.microservicios.users.entity.Login;

public interface LoginService {

	Login saveUser(Login id);

	Login seachUser(String id);

	void deteleUser(String id);

}
