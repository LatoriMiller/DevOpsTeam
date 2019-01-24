package com.techtalentsouth.DevOpsTeam.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mainController {
	
	@GetMapping("/")
	public ModelAndView indexMethod() {
		ModelAndView mv = new ModelAndView("index");
				return mv;
	}
	@GetMapping("/jayanti")
	public ModelAndView jayantiMethod() {
		ModelAndView mv1 = new ModelAndView("jayanti");
		return mv1;
	}
	@GetMapping("/latori")
	public ModelAndView latoriMethod() {
		ModelAndView mv2 = new ModelAndView("latori");
		return mv2;
	}
	@GetMapping("/sneha")
	public ModelAndView snehaMethod() {
		ModelAndView mv3 = new ModelAndView("sneha");
		return mv3;
	}
	@GetMapping("/stacey")
	public ModelAndView staceyMethod() {
		ModelAndView mv4 = new ModelAndView("stacey");
		return mv4;
	}

}
