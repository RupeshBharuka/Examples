package zooparkapp;

public class Elephant extends Animal{
	private String livingPlace;

	public String getLivingPlace() {
		return livingPlace;
	}

	public void setLivingPlace(String livingPlace) {
		this.livingPlace = livingPlace;
	}
	
	public void initElephant(){
		System.out.println("Init method of Elephant");
	}
	
	public String toString(){
		return "[Living Place : " +livingPlace +"]";		
	} 
	
}
