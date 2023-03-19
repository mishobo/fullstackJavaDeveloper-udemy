package husseinabdallah.java.polymorphism;

public class Polymorphism {

	public static void main(String[] args) {
		Phone phone = new Phone("Nokia 3310");
		System.out.println(phone.getModel());
		phone.features();
		
		SamsungNoteSeries note8 = new SamsungNoteSeries("Note 8");
		System.out.println(note8.getModel());
		note8.features();
		
		Phone note9 = new SamsungNoteSeries("Note 9");
		System.out.println(note9.getModel());
		note9.features();
		
		Phone nokia = new Nokia("Nokia 3310");
		System.out.println(nokia.getModel());
		nokia.features();
		
		Phone note = new Polymorphism().phone(1);
		System.out.println(note.getModel());
		note.features();
		
		Phone nokia1 =new Polymorphism().phone(2);
		System.out.println(nokia1.getModel());
		nokia1.features();
		
		
		
	}
	
	
	public Phone phone(int dailyDriver) {
		switch(dailyDriver) {
		case 1:	return new Nokia("5210");
		case 2:	return new SamsungNoteSeries("Note 10");
		}
		return null;
	}

}
