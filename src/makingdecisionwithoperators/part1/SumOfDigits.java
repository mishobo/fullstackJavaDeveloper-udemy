package makingdecisionwithoperators.part1;

public class SumOfDigits {
	
/**
 * @param args
 * Getting sum of numbers
 * STEPS
 * Get remainder from the value
 * Divide the value by 10 and over-writing the value
 * Repeat the process till the value is less than 10
 * Add the last digit to the sum of digit variable
 * 
 */

	public static void main(String[] args) {
		System.out.println("sum of digits : " + sumofdigits(1884));
	}
	
	public static int sumofdigits(int value) {
		int sumOfDigits = 0;
		int remainder = 0;
		
		while(true) {
			remainder = value%10;
			System.out.println("current remainder : " + remainder);
			value = value /10;	
			System.out.println("current value :" + value);
			
			sumOfDigits = sumOfDigits + remainder;
			if(value < 10) {
				break;
			}
		}
		sumOfDigits = sumOfDigits + value;
		return sumOfDigits;
		
	}

}
