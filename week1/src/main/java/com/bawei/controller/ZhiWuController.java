package com.bawei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bawei.pojo.ZhiWu;
import com.bawei.service.ZhiWuService;
import com.github.pagehelper.PageInfo;

@Controller
public class ZhiWuController {
	@Autowired
	private ZhiWuService zhiWuService;
	
	@RequestMapping("/queryAll")
	public String queryAll(ZhiWu zhiWu,
			@RequestParam(value="pageNum",defaultValue="1")int pageNum,
			Model model){
		List<ZhiWu> queryAll = zhiWuService.queryAll(zhiWu, pageNum);
		model.addAttribute("p",new PageInfo<ZhiWu>(queryAll));
		model.addAttribute("lists",zhiWu);
		return "/list.jsp";
	}
}
