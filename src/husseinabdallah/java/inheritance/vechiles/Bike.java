package husseinabdallah.java.inheritance.vechiles;

import husseinabdallah.java.inheritance.parent.Vehicle;

public class Bike extends Vehicle{
	private String handle;
	
	public Bike() {
		super();
		this.handle = "short";
	}
	
	public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine, wheels, seats, fuelTank,lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights()
				+ "]";
	}
	
	public void run() {
		System.out.println("Running vechile");
		System.out.println(toString());
	}
	
}
