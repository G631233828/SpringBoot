package gjb.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("gjb.mybatis.mapper")//����ɨ��mybatis��mapper�ӿڣ�����ɨ�赽�Ľӿ����ɴ������
public class MainClass {

	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
	}

}
