package org.dullnull.Service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {

	// 调用BaseDao  增加一个实体方法
	public void add(T entity);
	// 调用BaseDao  删除一个实体方法
	public void delete(T entity);
	// 调用BaseDao  更改一个实体方法
	public void update(T entity);
	// 调用BaseDao  根据id查找到某个实体的方法
	public T findById(Serializable id);
	// 调用BaseDao  查找所有的实体的方法
	public List<T> findAll();
	//调用BaseDao  查找一定条件下的List列表
	public List<T> findByCondition(String condition);
}
