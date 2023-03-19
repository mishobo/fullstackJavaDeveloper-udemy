package husseinabdallah.java.polymorphism;

public class Phone {
	private String model;
	
	public Phone(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void features() {
		System.out.println("Feature phone");
	}

	@Override
	public String toString() {
		return "Phone [model=" + model + "]";
	}
	
	
}
