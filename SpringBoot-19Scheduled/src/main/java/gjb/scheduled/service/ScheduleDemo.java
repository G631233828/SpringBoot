//package gjb.scheduled.service;
//
//import java.util.Date;
//
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//
///**
// * 定时任务demo
// * @author fliay
// *
// */
//@Component
//public class ScheduleDemo {
//
//	/**
//	 * 定时任务方法
//	 * @Scheduled 设置定时任务
//	 * cron cron表达式 定时任务触发时间的一个字符串表达形式
//	 * cron(秒 分 时 天 月 年 ?)  
//	 * ?表示占位
//	 * 0/2 从0开始，没间隔2秒执行1次 
//	 */
//	@Scheduled(cron="0/2 * * * * ?")
//	public void todoSchedule(){
//		System.out.println(new Date());
//	}
//	
//	/**
//	 * 每分钟的10-15秒执行
//	 */
//	@Scheduled(cron="10-15 * * * * ?")
//	public void todoSchedule2(){
//		System.out.println(new Date());
//	}
//	
//	
//	/**
//	 * 每分钟的10和15秒执行
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
