package com.edner.daza.demo.service;

import java.util.List;

import com.edner.daza.demo.model.User;

public interface UserService {

	/**
	 * Guarda un Usuario
	 * 
	* @parent user
	* @return el usuario guardado
	* 
	* **/
	User save(User user);

	/**
	* Recupera la lista de usuarios
	* 
	* @return lista de usuarios
	* 
	* **/
	List<User> findAll();

}
