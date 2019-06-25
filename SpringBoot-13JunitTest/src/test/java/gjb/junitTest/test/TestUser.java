package gjb.junitTest.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import gjb.junitTest.MainClass;
import gjb.junitTest.service.Impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={MainClass.class})
public class TestUser {

	private @Autowired UserServiceImpl userService;
	
	@Test
	public void test01(){
		userService.addUser();
	}
	
	
}
