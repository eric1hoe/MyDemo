package com.hp.controller;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hp.dao.SpringJDBCTest;
import com.hp.model.Kid;
import com.hp.service.PersonService;

@Controller
public class GreetingController {
	@Autowired
	private PersonService personService;
	@RequestMapping("/greeting")
	@ResponseBody
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model,HttpSession session) {
		personService.insertKid();
        System.out.println("insert into 2 kids");
        return "";
    }
	@RequestMapping("/index")
	public String toIndex()
	{
		return "index";
	}

	@RequestMapping("/boss/easysettlement/refreshRate")
	@ResponseBody
	public String refreshRate(String channelApi, HttpServletResponse response) {
		System.out.println("channelApi="+channelApi);
		return "ssssss";
	}
}
