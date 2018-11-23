package com.edner.daza.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edner.daza.demo.dao.UserRepository;
import com.edner.daza.demo.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	protected UserRepository userRepository;

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.userRepository.findAll();
	}
	
}
