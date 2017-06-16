package importannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext(BConfig.class);
		// now both beans A and B will be available...
//		A a = ctx.getBean("ABean", A.class); // OK, no exception, nothing
		A a = ctx.getBean(A.class); 
		a.setaMessage("A message");
		System.out.println(a.getaMessage());
		
		B b = ctx.getBean(B.class);
		b.setbMessage("B message");
		System.out.println(b.getbMessage());
	}
}
