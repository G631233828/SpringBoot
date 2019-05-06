package gjb.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
@SpringBootApplication //使用SpringBootApplication 相当于使用 @Configuration,@EnableAutoConfiguration和@ComponentScan
public class ExampleController {

	@RequestMapping("/")
	public String helloworld() {
		
		System.out.println(myService.openConnection());
		return "hello world";

	}
	
	@Autowired
	private MyService myService;

	public static void main(String[] args) {
		//通过java代码配置禁用默认重启
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(ExampleController.class, args);
	}

}
