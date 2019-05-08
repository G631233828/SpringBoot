package gjb.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import gjb.springboot.pojo.User;

@RestController
public class UserController {

	@RequestMapping("user/list")
	public ModelAndView findUser() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/userlist");
		List<User> list = new ArrayList();
		list.add(new User("fliay", 27, "�Ϻ�"));
		list.add(new User("jack", 26, "����"));
		list.add(new User("mary", 31, "����"));
		list.add(new User("Link", 17, "�ձ�"));
		model.addObject("userlist", list);
		return model;
	}

}
