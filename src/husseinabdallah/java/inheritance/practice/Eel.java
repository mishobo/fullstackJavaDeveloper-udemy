package husseinabdallah.java.inheritance.practice;

public class Eel extends Fish{
	private String special;
	
	public Eel() {
		super();
		this.special = "Releases electric stock";
	}


	public String showInfo() {
		return "Eel [special=" + special + ", waterborne=" + waterborne + ", gills=" + gills + ", height=" + height
				+ ", weight=" + weight + ", type=" + type + ", bloodType=" + bloodType + "]";
	}
	
	
}
