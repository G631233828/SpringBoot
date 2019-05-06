package gjb.springboot.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


/**
 * T
 * @author fliay
 * ����ͨ��exclude�������ɳ��Զ�����DataSourceAutoConfiguration���Զ������ࡣ
 */
@Configuration
@EnableAutoConfiguration(exclude=DataSourceAutoConfiguration.class)
@Profile(value="dev") //���ü������ڣ�����dev�����¼���
public class MyConfiguration {

}
