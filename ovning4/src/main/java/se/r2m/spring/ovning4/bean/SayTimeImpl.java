package se.r2m.spring.ovning4.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=BeanDefinition.SCOPE_PROTOTYPE)
public class SayTimeImpl implements SayTime, InitializingBean {
	
	String time;
	
	public String formattedTime() {
		return time;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
}
