package gjb.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 1.��resourcesĿ¼�´���staticĿ¼����staticĿ¼�·�����һ��ͼƬ��ͨ������������֮�󣬿���ֱ��ͨ��localhost:8080/test.jpg�����з���ͼƬ
 * 2.��src/main Ŀ¼�´���webappĿ¼����webappĿ¼�·�����һ��ͼƬ��ͨ������������֮�󣬿���ֱ��ͨ��localhost:8080/test2.jpg�����з���
 * @author fliay
 *
 */
@SpringBootApplication
public class MainClass {

	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
	}

}
