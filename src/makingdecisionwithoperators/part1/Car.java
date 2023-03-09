package makingdecisionwithoperators.part1;

public class Car {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Car(String doors, String engine, String driver, int speed) {
		super();
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}


	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String run() {
		if(doors.equalsIgnoreCase("closed") && engine.equalsIgnoreCase("on") && driver.equalsIgnoreCase("seated") && speed > 0) {
			return "running";
		} else {
			return "not running";
		}
	}
	
}
