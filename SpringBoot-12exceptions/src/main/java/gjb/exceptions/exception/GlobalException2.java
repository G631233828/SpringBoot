package gjb.exceptions.exception;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

/**
 * 全局异常处理
 * @author fliay
 *
 */
@Configuration
public class GlobalException2  {
	
	/**
	 * 此方法只能拦截异常，出现异常之后跳转到指定页面，无法将错误信息传递到前台界面。
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
