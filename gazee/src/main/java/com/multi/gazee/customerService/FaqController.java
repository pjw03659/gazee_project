package com.multi.gazee.customerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FaqController {

	@Autowired
	FaqDAO dao;

	@RequestMapping("customerService/faqlist")
	public void list(Model model) {
		List<FaqVO> list = dao.list();
		model.addAttribute("list", list);
	}

	@RequestMapping("customerService/faqCategory")
	public void category(Model model, String category1) {
		List<FaqVO> faqCategory = dao.category(category1);
		model.addAttribute("category", faqCategory);
	}
	
	@RequestMapping("customerService/faqOne")
	public void one(int no, Model model) {
		FaqVO bag = dao.one(no);
		model.addAttribute("bag",bag);
	}
}
