package com.lib.onlineLibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lib.libraryBackend.dao.CategoryDao;
import com.lib.libraryBackend.dto.Category;

@Controller
public class PageController
{
	
	@Autowired
	private CategoryDao categoryDao;
	
	
	@RequestMapping(value= {"/","home"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");	
		
		mv.addObject("categories",categoryDao.listAll());	
		
		
		mv.addObject("userClickHome",true);
		
		return mv;
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");	
		mv.addObject("userClickAbout",true);
		
		return mv;
	}
	
	
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact");	
		mv.addObject("userClickContact",true);
		
		return mv;
	}
	
	
}
