package gjb.exceptions.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常处理
 * @author fliay
 *
 */
@ControllerAdvice
public class GlobalException {
	
	/**
	 * 该方法需要返回一个ModelAndView，目的是可以让我们封装异常信息以及视图的指定
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value={java.lang.ArithmeticException.class})
	public ModelAndView arithmeticExceptionHandler(Exception e){
		ModelAndView model = new ModelAndView();
		model.addObject("error", e.toString());
		model.setViewName("error2");
		return model;
	}

	
	/**
	 * 该方法需要返回一个ModelAndView，目的是可以让我们封装异常信息以及视图的指定
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value={java.lang.NullPointerException.class})
	public ModelAndView nullPointerException(Exception e){
		ModelAndView model = new ModelAndView();
		model.addObject("error", e.toString());
		model.setViewName("error3");
		return model;
	}
}
