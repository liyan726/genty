package com.genty.Mapper;

import com.genty.model.User;

public interface UserMapper {

	User selectUserByid(int id);
	
	User selectUserByname(String name);
}
