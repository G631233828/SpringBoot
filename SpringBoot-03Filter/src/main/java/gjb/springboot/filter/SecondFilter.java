package gjb.springboot.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * SpringBoot 整合Filter 02
 * 
 * @author fliay
 */

public class SecondFilter implements Filter {

	public void destroy() {

		System.out.println("second Filter 销毁");
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("second Filter 初始化");
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("执行  second doFilter");
		arg2.doFilter(arg0, arg1);
		System.out.println("执行完   second doFilter");

	}

}
