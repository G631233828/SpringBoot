package gjb.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;



/**
 * Springboot ���� Listener
 * @author fliay
 *
 *	<listener>
 *		<listener-class>gjb.springboot.listener.FirstListener</listener-class>	
 *	</listener>
 *
 */
@WebListener
public class FirstListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
	
		System.out.println("listener ����"); 
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("listener ��ʼ��");
		
	}

}
