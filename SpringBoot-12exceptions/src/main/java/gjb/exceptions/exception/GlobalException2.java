package gjb.exceptions.exception;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

/**
 * ȫ���쳣����
 * @author fliay
 *
 */
@Configuration
public class GlobalException2  {
	
	/**
	 * �˷���ֻ�������쳣�������쳣֮����ת��ָ��ҳ�棬�޷���������Ϣ���ݵ�ǰ̨���档
	 * @return
	 */
	@Bean
	public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
		SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
		Properties mappings = new Properties();
		mappings.put("java.lang.ArithmeticException", "error2");
		mappings.put("java.lang.NullPointerException", "error2");
		resolver.setExceptionMappings(mappings);
		return resolver;
	}
}
