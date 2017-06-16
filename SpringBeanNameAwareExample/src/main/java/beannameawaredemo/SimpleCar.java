package beannameawaredemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class SimpleCar implements BeanFactoryAware,BeanNameAware{
	
	private String carName;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	/* 
	 * Invoked after population of normal bean properties but before an init callback such as 
	 * InitializingBean.afterPropertiesSet() or a custom init-method.
	 *  
	 */
	public void setBeanName(String name) {
			System.out.println("Bean Name : " +name);
	}
	/*
	 * Invoked after the population of normal bean properties but before an initialization callback such as 
	 * InitializingBean.afterPropertiesSet() or a custom init-method.
	 * 
	 */
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
			System.out.println("Bean Factory : " +beanFactory);
	}
	
}
