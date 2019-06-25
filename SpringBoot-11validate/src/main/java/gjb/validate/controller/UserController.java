package gjb.validate.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gjb.validate.pojo.User;

@RestController
public class UserController {

	
	@RequestMapping("/addUser")
	public String addUser(@Validated User user,BindingResult result){
		if(result.hasErrors()){
			return result.getFieldError().getDefaultMessage();
		}
		
		return "ok";
	}
	
	
	@RequestMapping("/toAddUser")
	public String toAddUser(){
		
		return "add";
	}
	
}
