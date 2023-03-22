package husseinabdallah.java.polymorphism.interfaces;

public class PhoneImplementation implements Phone {

	@Override
	public String processor() {
		return "SD835";
	}

	@Override
	public String os() {
		return "Android";
	}

	@Override
	public int spaceInGB() {
		return 64;
	}

}
