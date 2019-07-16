package gjb.scheduled.service;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

public class QuartzDemo implements Job {

	
	@Autowired
	private UserService userService;
	
	/**
	 * 任务被触发时所执行的方法
	 */
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		this.userService.toAdd();
		System.out.println("Execute  ...   " + new Date());
	}

//	public static void main(String[] args) throws SchedulerException {
//		// 1.创建job对象，要做什么
//		JobDetail job = JobBuilder.newJob(QuartzDemo.class).build();
//		// 2.创建Trigger对象，在什么时间做
//		/**
//		 * Trigger 触发时间：通过Quartz提供一个方法来完成简单的重复调用 cron Trigger 按照cron表达式来给点触发时间
//		 */
//		/*Trigger trigger = TriggerBuilder.newTrigger().withSchedule(SimpleScheduleBuilder.repeatSecondlyForever())
//				.build();*/
//		Trigger trigger = TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?"))
//				.build();
//		// 3.创建Scheduler对象 在什么时间做什么事
//		Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
//		scheduler.scheduleJob(job, trigger);
//		//启动
//		scheduler.start();
//
//	}

}
