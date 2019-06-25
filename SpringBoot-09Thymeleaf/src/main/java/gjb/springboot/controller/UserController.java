package gjb.springboot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import gjb.springboot.pojo.User;

@RestController
public class UserController {

	@RequestMapping("user/list")
	public ModelAndView findUser() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/ThymeleafTest");
		List<User> list = new ArrayList();
		list.add(new User("fliay", 27, "�Ϻ�"));
		list.add(new User("jack", 26, "����"));
		list.add(new User("mary", 31, "����"));
		list.add(new User("Link", 17, "�ձ�"));
		//model.addObject("userlist", list);
		model.addObject("msg", "hello thymeleaf");
		model.addObject("date", new Date());
		//�ж�
		model.addObject("flag", true);
		model.addObject("number", 3);
		//���ϱ���
		model.addObject("userlist", list);
		
		return model;
	}
	
	
	
	@RequestMapping("testMap")
	public ModelAndView testMap() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/testMap");
		Map<String,User> list = new HashMap<String, User>();
		list.put("1",new User("fliay", 27, "�Ϻ�"));
		list.put("2",new User("jack", 26, "����"));
		list.put("3",new User("mary", 31, "����"));
		list.put("4",new User("Link", 17, "�ձ�"));
		
		model.addObject("map", list);
		
		return model;
	}
	
	@RequestMapping("testSession")
	public ModelAndView testSession(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		model.setViewName("/testSession");
		request.setAttribute("request", "request");
		request.getSession().setAttribute("session", "session");
		request.getSession().getServletContext().setAttribute("application", "application");
		return model;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
