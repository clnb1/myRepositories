package com.bawei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.ZhiWuDao;
import com.bawei.pojo.ZhiWu;
import com.bawei.service.ZhiWuService;
import com.github.pagehelper.PageHelper;
@Service
public class ZhiWuServiceImpl implements ZhiWuService{
	@Autowired
	private ZhiWuDao zhiWuDao;
	@Override
	public List<ZhiWu> queryAll(ZhiWu zhiWu, int pageNum) {
		PageHelper.startPage(pageNum,3);
		return zhiWuDao.queryAll(zhiWu);
	}

	@Override
	public int add(ZhiWu zhiWu) {
		return zhiWuDao.add(zhiWu);
	}

	@Override
	public int delete(int id) {
		return zhiWuDao.delete(id);
	}

	@Override
	public ZhiWu queryById(int id) {
		return zhiWuDao.queryById(id);
	}

	@Override
	public int update(ZhiWu zhiWu) {
		return zhiWuDao.update(zhiWu);
	}

}
