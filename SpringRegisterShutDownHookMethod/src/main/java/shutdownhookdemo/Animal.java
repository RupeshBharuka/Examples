package shutdownhookdemo;

public class Animal {
	private String animalName;

	public Animal(String animalName){
		this.animalName = animalName;
	}
	
	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}	
	
	public void preDestroy(){
		System.out.println("preDestroy will get called before destruction of an instance");		
	}
	
}
