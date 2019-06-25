package gjb.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("gjb.mybatis.mapper")//用于扫描mybatis的mapper接口，根据扫描到的接口生成代理对象
public class MainClass {

	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
	}

}
