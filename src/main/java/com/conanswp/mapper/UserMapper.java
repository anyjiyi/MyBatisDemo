package com.conanswp.mapper;

import com.conanswp.pojo.User;

public interface UserMapper {
	public User getUser(int id);
	public int deleteUser(int id);
	public int insertUser(User user);
}
