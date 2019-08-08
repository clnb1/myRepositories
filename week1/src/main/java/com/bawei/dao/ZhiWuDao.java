package com.bawei.dao;

import java.util.List;

import com.bawei.pojo.ZhiWu;

public interface ZhiWuDao {
	public 	List<ZhiWu> queryAll(ZhiWu zhiWu);
	
	public int add(ZhiWu zhiWu);
	
	public int delete(int id);
	
	public ZhiWu queryById(int id);
	
	public int update(ZhiWu zhiWu);
}
