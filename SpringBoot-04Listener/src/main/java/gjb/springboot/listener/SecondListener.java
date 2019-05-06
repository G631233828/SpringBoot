package gjb.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;



/**
 * Springboot 整合 Listener
 * @author fliay
 *
 */
public class SecondListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
	
		System.out.println("second listener 销毁"); 
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("second listener 初始化");
		
	}

}
