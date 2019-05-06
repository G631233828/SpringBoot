package gjb.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import gjb.springboot.servlet.SecondServlet;

@SpringBootApplication
public class MainClass2 {

	public static void main(String[] args) {
		SpringApplication.run(MainClass2.class, args);
	}

	@Bean
	public ServletRegistrationBean getServletRegistrationBean(){
		return new ServletRegistrationBean(new SecondServlet(), "/*");
	}
	
}
 