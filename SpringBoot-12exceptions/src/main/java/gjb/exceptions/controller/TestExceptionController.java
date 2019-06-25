package gjb.exceptions.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestExceptionController {

	
	/**
	 * 如果在templates目录下有error.html默认出现错误的时候会跳转到该页面
	 * @return
	 */
	@RequestMapping("/test01")
	public String test01(){
		int i= 1/0;
		return "success";
	}
	
//	/**
//	 * 该方法需要返回一个ModelAndView，目的是可以让我们封装异常信息以及视图的指定
//	 * @param e
//	 * @return
//	 */
//	@ExceptionHandler(value={java.lang.ArithmeticException.class})
//	public ModelAndView arithmeticExceptionHandler(Exception e){
//		ModelAndView model = new ModelAndView();
//		model.addObject("error", e.toString());
//		model.setViewName("error2");
//		return model;
//	}
}
