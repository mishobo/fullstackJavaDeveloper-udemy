package husseinabdallah.java.exceptionHandling;

public class ExceptionHandling {

	public void case1(int x, int y) {
		if(y != 0) {
			System.out.println(x/y);
		}else {
			System.out.println("The value of y is 0");
		}
	}
	
	public void case2(int x, int y) {
		try {
			System.out.println(x/y);
		}catch(Exception e) {
			System.out.println("The value of y is 0");
		}
	}
	
	public void case3() {
		int x;
		try {
			x = 10/0;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void case4() {
		int x = 0;
		try {
			System.out.println("This statement will get executed");
			System.out.println("Trying partial execution :" + 10/x);
			System.out.println("Statements after an excetion are not executed");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void case5() {
		int x = 0;
		try {
			System.out.println("This statement will get executed");
			System.out.println("Trying partial execution :" + 10/x);
			System.out.println("Statements after an excetion are not executed");
		}catch(ArithmeticException a) {
			System.out.println("An Arithmetic Exception Occured");
			a.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("An Exception Occured");
		}
	}
	
	public void case6() {
		int x = 2;
		try {
			System.out.println("Trying partial execution :" + 10/x);
		}catch(RuntimeException e) {
			System.out.println("Runtime exception occurred");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Runtime exception occurred");
			e.printStackTrace();
		}finally {
			System.out.println("This statement will get executed");
		}
		
	}
}
