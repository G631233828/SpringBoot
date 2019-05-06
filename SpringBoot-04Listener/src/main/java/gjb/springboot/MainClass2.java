package gjb.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

import gjb.springboot.listener.SecondListener;

@SpringBootApplication
public class MainClass2 {

	public static void main(String[] args) {
		SpringApplication.run(MainClass2.class, args);
	}

	/**
	 * ×¢²áListener
	 */
	@Bean
	public ServletListenerRegistrationBean getServletListenerRegistrationBean() {
		ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new SecondListener());
		return bean;
	}
}
