package com.bawei.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.pojo.ZhiWu;

public interface ZhiWuService {
	public 	List<ZhiWu> queryAll(ZhiWu zhiWu,@Param("pageNum")int pageNum);
	
	public int add(ZhiWu zhiWu);
	
	public int delete(int id);
	
	public ZhiWu queryById(int id);
	
	public int update(ZhiWu zhiWu);
}
