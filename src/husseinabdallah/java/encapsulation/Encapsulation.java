package husseinabdallah.java.encapsulation;

public class Encapsulation {
	
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person);
		
		Person person1 = new Person("Hussein Abdallah", 28, "Male");
		person1.setAge(30);
		System.out.println(person1);
		
	}

}
