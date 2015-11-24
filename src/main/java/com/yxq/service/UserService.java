package com.yxq.service;

import java.util.List;

import com.yxq.model.User;

public interface UserService {

	public void addUser(User user);
	
	public User getUserById(Integer userId);
	
	public List<User> getUserList(User user);
	
}
