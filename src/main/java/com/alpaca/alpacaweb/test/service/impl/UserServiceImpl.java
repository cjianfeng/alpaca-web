package com.alpaca.alpacaweb.test.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alpaca.alpacaweb.test.mapper.UserMapper;
import com.alpaca.alpacaweb.test.model.User;
import com.alpaca.alpacaweb.test.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;

	@Override
	public User getUserById(int userId) {
		return userMapper.getUserById(userId);
	}

}
