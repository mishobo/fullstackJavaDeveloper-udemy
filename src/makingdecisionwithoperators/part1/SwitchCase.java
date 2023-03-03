package makingdecisionwithoperators.part1;

public class SwitchCase {

	public static void main(String[] args) {
		switchCase3();
	}
	

	
	public static void switchCase1() {
		int x = 3;
		switch(x) {
		case 1: System.out.println("value of x is 1");
		break;
		case 2: System.out.println("value of x is 2");
		break;
		case 3: System.out.println("value of x is 3");
		break;
		default: System.out.println("value of x is neither 1,2, 3");
		break;
		}
	}
	
	public static void switchCase2() {
		char x = 'A';
		
		switch(x) {
		case 'a':
		case 'A':
			System.out.println("the value of x is a");
			break;
		case 'b':
			System.out.println("the value of x is b");
			break;
		case 'c':
			System.out.println("the value of x is c");
			break;
			default:
				System.out.println("the value of x is neither a, b, c");
				break;
			
		}
	}
	
	public static void switchCase3() {
		String name = "hussein";
		
		switch(name.toUpperCase()) {
		case "HUSSEIN":
			System.out.println("Software Developer");
			break;
		case "DENNO":
			System.out.println("CS Manager");
			break;
		case "KEN":
			System.out.println("Product owner");
			break;
			default:
				System.out.println("unknown");
				break;
		}
	}

}
