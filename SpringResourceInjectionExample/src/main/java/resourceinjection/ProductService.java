/*
 * Example of setter based Resource injection  
 *
*/

package resourceinjection;

import org.springframework.core.io.Resource;

public class ProductService {
	private Resource externalResource;

	public Resource getExternalResource() {
		return externalResource;
	}

	public void setExternalResource(Resource externalResource) {
		this.externalResource = externalResource;
	}

}
