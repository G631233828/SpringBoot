package gjb.springboot.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


/**
 * T
 * @author fliay
 * 可以通过exclude属性来派出自动配置DataSourceAutoConfiguration是自动配置类。
 */
@Configuration
@EnableAutoConfiguration(exclude=DataSourceAutoConfiguration.class)
@Profile(value="dev") //配置加载现在，处于dev环境下加载
public class MyConfiguration {

}
