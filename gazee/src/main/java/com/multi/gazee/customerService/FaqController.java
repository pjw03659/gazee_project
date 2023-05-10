package com.multi.gazee.customerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FaqController {
	
	@Autowired
	FaqDAO dao;
	
	@RequestMapping("faq.insert")
	public void insert(FaqVO bag) {
		dao.insert(bag);
	}
}
