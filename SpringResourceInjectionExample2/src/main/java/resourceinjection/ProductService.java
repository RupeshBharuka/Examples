/*
 * annother way of injecting resource by using 
 * ResourceLoader interface 
 * 
 */

package resourceinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class ProductService {
	/*
	 * if you don't wire the property with your configuration then
	 * it will throw null pointer exception
	 *  
	*/
	
	@Autowired
	private ResourceLoader externalResourceLoader;

	public Resource getResource(String location){
		return externalResourceLoader.getResource(location);
	}
}
