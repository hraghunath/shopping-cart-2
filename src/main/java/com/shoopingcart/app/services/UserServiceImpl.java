package com.shoopingcart.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoopingcart.app.entities.User;
import com.shoopingcart.app.repositories.UserRepository;
@Service
public class UserServiceImpl implements UserService {
  
	@Autowired
	private UserRepository userRepo;
	@Override
	public void saveUserInformation(User user) {
		userRepo.save(user);
		
	}
	@Override
	public List<User> getAllUsers() {
	List<User> user = userRepo.findAll();
		return user;
	}

}
