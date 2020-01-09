package com.xujunqi.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xujunqi.cms.pojo.User;

public interface BaseDao<T> {

	List<User> select(T t); // 按条件查询

	T selectById(Integer id); // 根据Id查询

	int insert(T t); // 新增
	
	int update(T t);  //修改

	int delete(@Param("ids") String ids);// 删除

}
