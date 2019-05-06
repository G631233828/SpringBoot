package gjb.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;



/**
 * Springboot 整合 Listener
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
	
		System.out.println("listener 销毁"); 
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("listener 初始化");
		
	}

}
