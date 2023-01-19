package com.microservicios.users.service.user;

import java.util.List;

import com.microservicios.users.entity.Dates;

public interface DateService {

	Dates saveDate(Dates id);

	//Dates seachDate(String id);
	List<Dates> seachDate(String username);

}
