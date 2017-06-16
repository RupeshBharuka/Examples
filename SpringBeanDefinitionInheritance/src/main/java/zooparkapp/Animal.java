package zooparkapp;

public class Animal {
	private String animalName;
	private int animalAge;
	private int animalWeight;

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public int getAnimalAge() {
		return animalAge;
	}

	public void setAnimalAge(int animalAge) {
		this.animalAge = animalAge;
	}

	public int getAnimalWeight() {
		return animalWeight;
	}

	public void setAnimalWeight(int animalWeight) {
		this.animalWeight = animalWeight;
	}
	
	public void initAnimal(){
		System.out.println("Init method of Animal");
	}
	
	public String toString(){
		return "[Animal Name : " +animalName 
				+"Animal Age : " +animalAge
				+"Animal Weight : " +animalWeight +"]";		
	}

}
