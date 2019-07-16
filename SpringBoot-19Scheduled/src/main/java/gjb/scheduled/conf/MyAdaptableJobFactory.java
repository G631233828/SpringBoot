package gjb.scheduled.conf;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

@Component
public class MyAdaptableJobFactory extends AdaptableJobFactory {

	// ��������ӵ�SpringIOC�����У�������ɶ�������ע��
	@Autowired
	private AutowireCapableBeanFactory autowireCapableBeanFactory;

	/**
	 * �÷�����Ҫʵ��������������ֶ���ӵ�SpringIoc�����У��������ע��
	 */

	@Override
	protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {

		Object obj = super.createJobInstance(bundle);
		this.autowireCapableBeanFactory.autowireBean(obj);
		return obj;

	}

}
