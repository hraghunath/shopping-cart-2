package com.shoopingcart.app.services;

import java.util.List;

import com.shoopingcart.app.entities.User;

public interface UserService {

	public void saveUserInformation(User user);

	public List<User> getAllUsers();

}
