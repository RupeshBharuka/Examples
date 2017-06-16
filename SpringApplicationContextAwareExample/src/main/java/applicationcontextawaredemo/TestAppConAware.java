package applicationcontextawaredemo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TestAppConAware implements ApplicationContextAware{
	ApplicationContext context;
	
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;	
		System.out.println("Set Application Context : " +applicationContext);
	}
	
	public ApplicationContext getApplicationContext(){
		return context;
	}
	
}
