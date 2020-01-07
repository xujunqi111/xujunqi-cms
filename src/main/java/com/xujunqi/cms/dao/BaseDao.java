package com.xujunqi.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xujunqi.cms.pojo.User;

public interface BaseDao<T> {

	List<User> select(User user); // 按条件查询

	User selectById(Integer id); // 根据Id查询

	int insert(User user); // 新增

	int delete(@Param("ids") String ids);// 删除

}
