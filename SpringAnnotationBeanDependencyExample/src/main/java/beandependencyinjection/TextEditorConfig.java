package beandependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 *  Note :
 *		This method of declaring inter-bean dependencies only works when the @Bean method is declared
 *		within a @Configuration class. You cannot declare inter-bean dependencies using plain
 *		@Component classes.
 * 
*/
@Configuration
public class TextEditorConfig {

	@Bean
	public TextEditor textEditor() {
		// When @Beans have dependencies on one another, expressing that
		// dependency is as simple as having
		// one bean method calling another bean method
		return new TextEditor(createSpellChecker());
	}

	/*
	 * By default scope of @Bean is singleton. So here it will return same
	 * instance every time it will call createSpellChecker() method.
	 * 
	 * If you want new instance to be created, specify scope of bean Eg. @Bean
	 * 
	 * @Scope("prototype")
	 *
	 */
	@Bean
	public SpellChecker createSpellChecker() {
		return new SpellChecker();
	}
}
