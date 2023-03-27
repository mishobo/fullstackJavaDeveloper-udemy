package husseinabdallah.java.userinput;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("What is your name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		sc.close();
		System.out.println("Hello there " + name);
		
//		Scanner sc1 = new Scanner(System.in);
//		int age = sc1.nextInt();
//		sc1.close();
//		System.out.println(age + "very good age");
	}

}
