package gjb.junitTest.service.Impl;

import org.springframework.stereotype.Service;

import gjb.junitTest.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	public void addUser() {
	
		System.out.println("success add a user");
		
	}

}
