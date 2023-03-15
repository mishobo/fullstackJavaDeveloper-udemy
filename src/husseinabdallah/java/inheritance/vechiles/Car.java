package husseinabdallah.java.inheritance.vechiles;

import husseinabdallah.java.inheritance.parent.Vehicle;

public class Car extends Vehicle{
	private String steering;
	private String musicSystem;
	private String seatBelt;
	private String airConditioner;
	private String fridge;
	private String entertainmentSystem;
	
	public Car() {
		super();
		this.steering = "short";
		this.musicSystem = "JBL";
		this.seatBelt = "black";
		this.airConditioner = "samsung";
		this.fridge = "samsung";
		this.entertainmentSystem = "hardman";
	}
	
	
	public Car(String steering, String musicSystem, String seatBelt, String airConditioner, String fridge,
			String entertainmentSystem) {
		super();
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.seatBelt = seatBelt;
		this.airConditioner = airConditioner;
		this.fridge = fridge;
		this.entertainmentSystem = entertainmentSystem;
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

	public String getFridge() {
		return fridge;
	}

	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}


	@Override
	public String toString() {
		return "Car [steering=" + steering + ", musicSystem=" + musicSystem + ", seatBelt=" + seatBelt
				+ ", airConditioner=" + airConditioner + ", fridge=" + fridge + ", entertainmentSystem="
				+ entertainmentSystem + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights()
				+ "]";
	}
	
	
	
}
