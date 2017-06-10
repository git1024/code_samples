package com.itheima.dao;

import java.util.List;

import com.itheima.domain.Topic;

public interface TopicDao {
	//保存帖子
	void save(Topic t);
	//根据条件查询帖子列表
	List<Topic> getAll(String key);
}
