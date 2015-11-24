package com.yxq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxq.dao.UserMapper;
import com.yxq.model.User;
import com.yxq.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}

	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public List<User> getUserList(User user) {
		// TODO Auto-generated method stub
		return userMapper.queryAll(user);
	}

}
