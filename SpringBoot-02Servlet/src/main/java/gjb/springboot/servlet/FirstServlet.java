package gjb.springboot.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  SpringBoot����Servlet 01 ��ͳ��web.xml�е����� <servlet>
 * <servlet-name>FirstServlet</servlet-name>
 * <servlet-class>gjb.springboot.servlet</servlet-class> </servlet>
 * <servlet-mapping> <servlet-name>FirstServlet</servlet-name>
 * <url-partten>/*</url-partten> </servlet-mapping>
 * @author fliay
 * ͨ��WebServlet���������� name Ϊservlet���ƣ�urlPartterns Ϊ���ص�url
 *
 */
@WebServlet(name = "FirstServlet", urlPatterns = "/*")
public class FirstServlet extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 3143899766596280491L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("hello servlet");

		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}

}
