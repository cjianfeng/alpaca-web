package com.alpaca.alpacaweb.test.mapper;

import org.apache.ibatis.annotations.Param;

import com.alpaca.alpacaweb.test.model.User;

public interface UserMapper {

	public User getUserById(@Param("userId")int userId);
}
