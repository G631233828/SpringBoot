package gjb.ehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MainClass {

	
	//������ַhttps://www.cnblogs.com/lic309/p/4072848.html
	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
	}

}
