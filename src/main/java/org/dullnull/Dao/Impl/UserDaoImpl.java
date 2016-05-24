package org.dullnull.Dao.Impl;

import org.dullnull.Dao.UserDao;
import org.dullnull.Entity.User;
import org.springframework.stereotype.Repository;
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	public UserDaoImpl() {
		super(User.class);
	}

}
