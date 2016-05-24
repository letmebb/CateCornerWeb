package org.dullnull.Service.Impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.dullnull.Dao.UserDao;
import org.dullnull.Dao.Impl.BaseDaoImpl;
import org.dullnull.Entity.User;
import org.dullnull.Service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	UserDao userDao;
	
	@Override
	public void add(User entity) {
		userDao.add(entity);
	}

	@Override
	public void delete(User entity) {
		userDao.delete(entity);
	}

	@Override
	public void update(User entity) {
		userDao.update(entity);
	}

	@Override
	public User findById(Serializable id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public List<User> findByCondition(String condition) {
		return userDao.findByCondition(condition);
	}


}
