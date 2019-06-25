package gjb.exceptions.exception;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

/**
 * 全局异常处理
 * @author fliay
 *
 */
@Configuration
public class GlobalException3 implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception ex) {
		
		ModelAndView model = new ModelAndView();
		
		if(ex instanceof ArithmeticException){
			model.setViewName("error1");
		}
		if(ex instanceof NullPointerException){
			model.setViewName("error2");
		}
		model.addObject("error", ex.getMessage());
		return model;
	}
	
	
}
