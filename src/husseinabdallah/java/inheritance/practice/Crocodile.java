package husseinabdallah.java.inheritance.practice;

public class Crocodile extends Reptile{

	public Crocodile() {
		super();
		egg = "Hard shell";
	}


	public String showInfo() {
		return "Crocodile [skin=" + skin + ", egg=" + egg + ", height=" + height + ", weight=" + weight + ", type="
				+ type + ", bloodType=" + bloodType + "]";
	}

	
	
	
	
}
