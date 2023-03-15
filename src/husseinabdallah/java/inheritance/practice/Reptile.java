package husseinabdallah.java.inheritance.practice;

public class Reptile extends Animal {
	
	protected String skin, egg;
	private boolean backbone;
	
	public Reptile() {
		height = 5;
		weight = 20; 
		type = "Reptile";
		bloodType = "cold";
		this.skin = "Dry Skin";
		this.egg = "soft shelled";
		this.backbone = true;
	}

	public String showInfo() {
		return "Reptile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", height=" + height + ", weight="
				+ weight + ", type=" + type + ", bloodType=" + bloodType + "]";
	}


	
	
	
	

}
