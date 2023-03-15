package husseinabdallah.java.inheritance.vechiles;

import husseinabdallah.java.inheritance.parent.Vehicle;

public class Truck extends Vehicle{
	private String steering;
	private String musicSystem;
	private String seatBelt;
	private String airConditioner;
	private String entertainmentSystem;
	private int container;
	
	public Truck() {
		super("Disel", 8, 3,100, "LED");
		this.steering = "long";
		this.musicSystem = "JBL";
		this.seatBelt = "RED";
		this.airConditioner = "samsung";
		this.entertainmentSystem = "samsung";
		this.container = 1;
	}

	public Truck(String steering, String musicSystem, String seatBelt, String airConditioner,
			String entertainmentSystem, int container,String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine, wheels,seats,fuelTank,lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.seatBelt = seatBelt;
		this.airConditioner = airConditioner;
		this.entertainmentSystem = entertainmentSystem;
		this.container = container;
	}

	public String getSteering() {
		return steering;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public String getSeatBelt() {
		return seatBelt;
	}

	public String getAirConditioner() {
		return airConditioner;
	}

	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}

	public int getContainer() {
		return container;
	}

	@Override
	public String toString() {
		return "Truck [steering=" + steering + ", musicSystem=" + musicSystem + ", seatBelt=" + seatBelt
				+ ", airConditioner=" + airConditioner + ", entertainmentSystem=" + entertainmentSystem + ", container="
				+ container + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()="
				+ getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights() + "]";
	}
	
	
	
}
