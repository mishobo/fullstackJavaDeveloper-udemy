package makingdecisionwithoperators.part1;

public class Decisions {

	public static void main(String[] args) {
		int x = 6;
		int y = 5;
		int z = 7;
		boolean a = true;
		boolean b = false;
		int time = 20;
		
		
		// comparison operator
		if (x == 5) {
			System.out.println("The value of x is 5");
		}else if(y < z){
			System.out.println(true);
		} else {
			System.out.println("The value of x is " + x);
		}
		
		// and operator
		if(a && b) {
			System.out.println("condition is true");
		} else {
			System.out.println("condition is false");
		}
		
		if ((x<z) && (a)) {
			System.out.println("And condition is true");
		}
		
		// not operator
		if(!b) {
			System.out.println("not true: converts a false statement to true");
		}
		
		if(!a || !b) {
			System.out.println("a or b is true");
		}
		
		//ternary operator
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);

	}

}
