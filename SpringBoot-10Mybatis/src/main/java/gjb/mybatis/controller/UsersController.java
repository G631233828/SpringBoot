package gjb.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import gjb.mybatis.pojo.Users;
import gjb.mybatis.service.UsersServiceImpl;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersServiceImpl userService;

	
	@RequestMapping("/input")
	public ModelAndView showPate(){
		ModelAndView model = new ModelAndView();
		model.setViewName("user/input");
		
		return model;
	}
	
	@RequestMapping("/addUser")
	public String addUsers(Users users){
		
		this.userService.addUser(users);
		return "success";
	}
	
	@RequestMapping("/findAllUser")
	public List<Users> findAllUser(){
		return this.userService.findAllUser();
	}
	@RequestMapping("/findUser/{id}")
	public Users findUser(@PathVariable(value="",name="id") Integer id,Model model){
		
		return this.userService.findUserById(id);
	}
	
	
	@RequestMapping("/updateUser/{id}")
	public Users updateUser(@PathVariable(value="",name="id") Integer id){
		Users users = new Users();
		users.setId(id);
		users.setPassword("is change");
		users.setUsername("hello");
		return this.userService.findUserById(id);
	}
	
	@RequestMapping("/delete/{id}")
	public List<Users> deleteUser(@PathVariable(value="",name="id") Integer id,Model model){
		int len = this.userService.delete(id);
		System.out.println(len);
		
		return this.userService.findAllUser();
	}
	
	
}
