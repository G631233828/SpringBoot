package gjb.exceptions.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestExceptionController {

	
	/**
	 * �����templatesĿ¼����error.htmlĬ�ϳ��ִ����ʱ�����ת����ҳ��
	 * @return
	 */
	@RequestMapping("/test01")
	public String test01(){
		int i= 1/0;
		return "success";
	}
	
//	/**
//	 * �÷�����Ҫ����һ��ModelAndView��Ŀ���ǿ��������Ƿ�װ�쳣��Ϣ�Լ���ͼ��ָ��
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
