//package gjb.scheduled.service;
//
//import java.util.Date;
//
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//
///**
// * ��ʱ����demo
// * @author fliay
// *
// */
//@Component
//public class ScheduleDemo {
//
//	/**
//	 * ��ʱ���񷽷�
//	 * @Scheduled ���ö�ʱ����
//	 * cron cron���ʽ ��ʱ���񴥷�ʱ���һ���ַ��������ʽ
//	 * cron(�� �� ʱ �� �� �� ?)  
//	 * ?��ʾռλ
//	 * 0/2 ��0��ʼ��û���2��ִ��1�� 
//	 */
//	@Scheduled(cron="0/2 * * * * ?")
//	public void todoSchedule(){
//		System.out.println(new Date());
//	}
//	
//	/**
//	 * ÿ���ӵ�10-15��ִ��
//	 */
//	@Scheduled(cron="10-15 * * * * ?")
//	public void todoSchedule2(){
//		System.out.println(new Date());
//	}
//	
//	
//	/**
//	 * ÿ���ӵ�10��15��ִ��
//	 */
//	@Scheduled(cron="10,15 * * * * ?")
//	public void todoSchedule3(){
//		System.out.println(new Date());
//	}
//	
//	
//	
//	
//	
//}
