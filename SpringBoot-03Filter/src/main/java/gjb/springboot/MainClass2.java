package gjb.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import gjb.springboot.filter.SecondFilter;

@SpringBootApplication
public class MainClass2 {

	public static void main(String[] args) {
		SpringApplication.run(MainClass2.class, args);
	}

	@Bean
	public FilterRegistrationBean getFilterRegistrationBean() {
		FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
		bean.addUrlPatterns("/second");
		return bean;
	}
}
