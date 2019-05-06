package gjb.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;



/**
 * Springboot ���� Listener
 * @author fliay
 *
 */
public class SecondListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
	
		System.out.println("second listener ����"); 
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("second listener ��ʼ��");
		
	}

}
