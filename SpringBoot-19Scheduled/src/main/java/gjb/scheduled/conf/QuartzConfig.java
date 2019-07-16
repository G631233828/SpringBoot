package gjb.scheduled.conf;

import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import gjb.scheduled.service.QuartzDemo;

/**
 * Quartz������
 * 
 * @author fliay
 *
 */
@Configuration
public class QuartzConfig {

	/**
	 * 1.����job���� 2.����Trigger���� 3.����scheduler����
	 */

	@Bean
	public JobDetailFactoryBean jobDetail() {
		JobDetailFactoryBean factory = new JobDetailFactoryBean();
		//����job��
		factory.setJobClass(QuartzDemo.class);
		return factory;
	}

	/**
	 * ������Scheduler
	 * @param jobDetail
	 * @return
	 */
//	@Bean
//	public SimpleTriggerFactoryBean trigger(JobDetailFactoryBean jobDetail) {
//		SimpleTriggerFactoryBean factory = new SimpleTriggerFactoryBean();
//		//����jobdetail����
//		factory.setJobDetail(jobDetail.getObject());
//		//���ô�������
//		factory.setRepeatCount(5);
//		//���ô�������
//		factory.setRepeatInterval(2000);
//		return factory;
//	}
	
	@Bean
	public CronTriggerFactoryBean trigger(JobDetailFactoryBean jobDetail){
		CronTriggerFactoryBean factory = new CronTriggerFactoryBean();
		factory.setJobDetail(jobDetail.getObject());
		factory.setCronExpression("0/5 * * * * ?");
		return factory;
	}
	

	@Bean
	public SchedulerFactoryBean scheduler(CronTriggerFactoryBean tr,MyAdaptableJobFactory myAdaptableJobFactory) throws SchedulerException {
		SchedulerFactoryBean factory = new SchedulerFactoryBean();
		factory.setTriggers(tr.getObject());
		factory.setJobFactory(myAdaptableJobFactory);
		return factory;
	}

}
