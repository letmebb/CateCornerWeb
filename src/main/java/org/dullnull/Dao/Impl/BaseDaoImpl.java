package org.dullnull.Dao.Impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.dullnull.Dao.BaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDaoImpl<T> implements BaseDao<T> {
	private Class<T> cls;

	public BaseDaoImpl(Class<T> cls) {
		this.cls = cls;
	}

	@Resource
	protected SessionFactory sessionFactory;

	@Resource
	protected JdbcTemplate jdbcTemplate;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void add(T entity) {
		try {
			getSession().save(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(T entity) {
		try {
			getSession().delete(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(T entity) {
		try {
			getSession().update(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public T findById(Serializable id) {
		T t = null;
		try {
			t = getSession().get(cls, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		List<T> list = null;
		try {
			Query query = getSession().createQuery("from " + cls.getName());
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<T> findByCondition(String condition) {
		List<T> list = null;
		try {
			Query query = getSession().createQuery("from" + cls.getName() + " as model where " + condition);
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
