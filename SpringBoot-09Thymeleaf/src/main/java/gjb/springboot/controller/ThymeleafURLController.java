package gjb.springboot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import gjb.springboot.pojo.User;

@RestController
public class ThymeleafURLController {

	@RequestMapping("/testurl")
	public ModelAndView findUser() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/url");
		return model;
	}
	
	
	
	@RequestMapping("testparam")
	public String testMap(String id,String name) {
		return "id="+id+",name="+name;
	}
	
	@RequestMapping("testparam/{id}")
	public String restfulPath(@PathVariable(value="id")String id,String name) {
		return "id="+id+",name="+name;
	}
	
	
	
	
	@RequestMapping("show")
	public String show() {
		return "show";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
