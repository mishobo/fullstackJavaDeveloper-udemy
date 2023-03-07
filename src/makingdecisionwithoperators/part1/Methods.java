package makingdecisionwithoperators.part1;

public class Methods {

	public static void main(String[] args) {
		isPrimeNumber(29);
	}
	
	public static boolean isPrimeNumber(int num) {
		boolean isPrime = true;
		int temp;
		for(int i = 2; i <= num /2; i++) {
			temp = num % i;
			if(temp == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
		
		return isPrime;
	
	}
	
	public static double areaOfTriangle(double width, double height) {
		double area = width * height;
		
		return area;
		
	}
	
	
	public static void loop3(int start, int stop) {
		while(start <= stop) {
			System.out.println(start);
			start++;
		}
	}
	
	public static void loop1() {
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void loop2() {
		int j = 20;
		while(j<=40) {
			System.out.println(j);
			j++;
		}
	}

}
