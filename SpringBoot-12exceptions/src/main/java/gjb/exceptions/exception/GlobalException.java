package gjb.exceptions.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * ȫ���쳣����
 * @author fliay
 *
 */
@ControllerAdvice
public class GlobalException {
	
	/**
	 * �÷�����Ҫ����һ��ModelAndView��Ŀ���ǿ��������Ƿ�װ�쳣��Ϣ�Լ���ͼ��ָ��
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
	 * �÷�����Ҫ����һ��ModelAndView��Ŀ���ǿ��������Ƿ�װ�쳣��Ϣ�Լ���ͼ��ָ��
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
