package husseinabdallah.java.inheritance.practice;

public class Fish extends Animal{

	protected boolean waterborne = true;
	protected boolean gills = true;
	
	public Fish() {
		type = "fish";
		this.waterborne = true;
		this.gills = true;	
	}

	public String showInfo() {
		return "Fish [waterborne=" + waterborne + ", gills=" + gills + ", height=" + height + ", weight=" + weight
				+ ", type=" + type + ", bloodType=" + bloodType + "]";
	}
	
}
