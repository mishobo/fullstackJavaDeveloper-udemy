package husseinabdallah.java.inheritance.practice;

public class Animal {

	protected int height;
	protected int weight;
	protected String type;
	protected String bloodType;
	
	public Animal() {
	this.height = 0;
	this.weight = 0;
	this.type = "unknown";
	this.bloodType = "unknown";
}
	
	public Animal(int height, int weight, String type, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.type = type;
		this.bloodType = bloodType;
	}


	public String showInfo() {
		return "Animal [height=" + height + ", weight=" + weight + ", type=" + type + ", bloodType=" + bloodType + "]";
	}
	
	
}
