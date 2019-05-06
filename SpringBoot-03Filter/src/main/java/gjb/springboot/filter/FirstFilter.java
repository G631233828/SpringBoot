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
 * SpringBoot ����Filter 01
 * 
 * @author fliay
 * 
 *         <filter> <filter-name>FirstFilter</filter-name>
 *         <filter-class>gjb.springboot.filter</filter-class> 
 *         </filter>
 *         <filter-mapping> 
 *         <filter-name>FirstFilter</filter-name>
 *         <url-partten>/filter</url-partten>
 *		   </filter-mapping>
 * 
 *
 */

@WebFilter(filterName = "FirstFilter", urlPatterns = { "*.do", "*.jsp", "/first" })
public class FirstFilter implements Filter {

	public void destroy() {

		System.out.println("first Filter ����");
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("first Filter ��ʼ��");
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("ִ�� doFilter");
		arg2.doFilter(arg0, arg1);
		System.out.println("ִ���� doFilter");

	}

}
