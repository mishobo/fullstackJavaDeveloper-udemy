package makingdecisionwithoperators.part1;

public class ForLoop {

	public static void main(String[] args) {
		forloop5();

	}
	
	public static void forloop5() {
		for(int i=1, j=1; i<10 || j<10; i++,j++) {
			j++;
			System.out.println("i="+i+" and j="+j);
		}
	}
	
	public static void forloop4() {
		for(int i=1, j=1; i<10 && j<10; i++,j++) {
			System.out.println("i="+i+" and j="+j);
		}
	}
	
	public static void whileloop1() {
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void forloop3() {
		for(int i = 1000; i>=100; i--) {
			System.out.println(i);
		}
	}
	
	public static void forloop2() {
		for(int i = 0; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	public static void forloop1() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println("6\n7\n8\n9\n10");
	}

}
