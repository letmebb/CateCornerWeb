package org.dullnull.Dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	//在数据库中增加一个实体方法
	public void add(T entity);
	//在数据库中删除一个实体方法
	public void delete(T entity);
	//在数据库中更改一个实体方法
	public void update(T entity);
	//在数据库中根据id查找到某个实体的方法
	public T findById(Serializable id);
	//在数据库中查找所有的实体的方法
	public List<T> findAll();
	//在数据库中查找所有符合条件的实体的方法
	public List<T> findByCondition(String condition);
}
