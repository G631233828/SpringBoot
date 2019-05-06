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
 * SpringBoot ����Filter 02
 * 
 * @author fliay
 */

public class SecondFilter implements Filter {

	public void destroy() {

		System.out.println("second Filter ����");
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("second Filter ��ʼ��");
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("ִ��  second doFilter");
		arg2.doFilter(arg0, arg1);
		System.out.println("ִ����   second doFilter");

	}

}
