package husseinabdallah.java.polymorphism.interfaces;

public class Interfaces {
	
	public static void main (String[] args) {
		Phone phone = new PhoneImplementation();
		System.out.println(phone.processor());
		
		Phone phone1 = new IphoneVII();
		System.out.println(phone1.processor());
	}

}
