package gjb.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
@SpringBootApplication //ʹ��SpringBootApplication �൱��ʹ�� @Configuration,@EnableAutoConfiguration��@ComponentScan
public class ExampleController {

	@RequestMapping("/")
	public String helloworld() {
		
		System.out.println(myService.openConnection());
		return "hello world";

	}
	
	@Autowired
	private MyService myService;

	public static void main(String[] args) {
		//ͨ��java�������ý���Ĭ������
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(ExampleController.class, args);
	}

}
