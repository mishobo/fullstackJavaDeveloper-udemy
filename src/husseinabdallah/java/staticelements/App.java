package husseinabdallah.java.staticelements;

public class App {

	public static void main(String[] args) {
		System.out.println("Current variable value: "+StaticTest.getStaticVariable());
		StaticTest.setStaticVariable(1);
		   System.out.println("Current variable value: "+StaticTest.getStaticVariable());
		   StaticTest.setStaticVariable(24);
		   System.out.println("Current variable value: "+StaticTest.getStaticVariable());

	}

}
