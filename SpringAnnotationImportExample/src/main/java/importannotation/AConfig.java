package importannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AConfig {
//	@Bean(name = "same") //exception will be thrown 
//	@Bean(name="ABean") //OK : NO exception, nothing
	@Bean //OK : NO exception, nothing
	public A createA(){
		return new A();
	}
}
