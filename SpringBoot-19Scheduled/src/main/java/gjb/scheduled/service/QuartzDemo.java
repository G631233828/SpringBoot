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
	 * ���񱻴���ʱ��ִ�еķ���
	 */
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		this.userService.toAdd();
		System.out.println("Execute  ...   " + new Date());
	}

//	public static void main(String[] args) throws SchedulerException {
//		// 1.����job����Ҫ��ʲô
//		JobDetail job = JobBuilder.newJob(QuartzDemo.class).build();
//		// 2.����Trigger������ʲôʱ����
//		/**
//		 * Trigger ����ʱ�䣺ͨ��Quartz�ṩһ����������ɼ򵥵��ظ����� cron Trigger ����cron���ʽ�����㴥��ʱ��
//		 */
//		/*Trigger trigger = TriggerBuilder.newTrigger().withSchedule(SimpleScheduleBuilder.repeatSecondlyForever())
//				.build();*/
//		Trigger trigger = TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?"))
//				.build();
//		// 3.����Scheduler���� ��ʲôʱ����ʲô��
//		Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
//		scheduler.scheduleJob(job, trigger);
//		//����
//		scheduler.start();
//
//	}

}
