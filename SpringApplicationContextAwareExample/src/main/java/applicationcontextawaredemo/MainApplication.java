package applicationcontextawaredemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		TestAppConAware appcontext= (TestAppConAware)context.getBean("appcontextawareId");
		ApplicationContext appCon =appcontext.getApplicationContext();
		
		Task task= (Task)appCon.getBean("taskId");
		task.doSomeTask();
		
		context.registerShutdownHook();

	}

}
