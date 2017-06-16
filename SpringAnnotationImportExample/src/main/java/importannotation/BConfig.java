package importannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(AConfig.class)
@Configuration
public class BConfig {

//	@Bean(name = "same") //exception will be thrown 
	@Bean //OK : no exception, nothing
	public B createB(){
		return new B();
	}
}
