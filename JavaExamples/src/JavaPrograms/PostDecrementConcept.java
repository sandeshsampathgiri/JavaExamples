package JavaPrograms;

public class PostDecrementConcept {

	public static void main(String[] args) {
	
		int a=10;
		System.out.println("Initial value of a is"+a);
		
		int b=a--;
		System.out.println("Final value of a is "+a);
		System.out.println("Final value of b is "+b);

		//Expected value of a is 9 while b is that of 10
	}

}
