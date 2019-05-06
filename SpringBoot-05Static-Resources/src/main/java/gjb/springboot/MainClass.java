package gjb.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 1.在resources目录下创建static目录，在static目录下放入了一张图片，通过启动类启动之后，可以直接通过localhost:8080/test.jpg来进行访问图片
 * 2.在src/main 目录下创建webapp目录，在webapp目录下放入了一张图片，通过启动类启动之后，可以直接通过localhost:8080/test2.jpg来进行访问
 * @author fliay
 *
 */
@SpringBootApplication
public class MainClass {

	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
	}

}
