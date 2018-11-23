package com.edner.daza.demo.service;

import java.util.List;

import com.edner.daza.demo.model.User;

public interface UserService {

	User save(User user);

	List<User> findAll();

}
