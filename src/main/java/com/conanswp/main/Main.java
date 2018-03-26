package com.conanswp.main;

import org.apache.ibatis.session.SqlSession;

import com.conanswp.mapper.UserMapper;
import com.conanswp.pojo.User;
import com.conanswp.util.SqlSessionFactoryUtil;

public class Main {
	public static void main(String[] args) {
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.openSqlSession();
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = new User();
			user.setId(10010);
			user.setName("Gunner");
			userMapper.insertUser(user);
			sqlSession.commit();
		} catch (Exception ex) {
			System.out.println(ex);
			sqlSession.rollback();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}
}
