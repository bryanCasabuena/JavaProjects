import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		
		double x1, x2;
		String operation; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first value: ");
		x1 = scan.nextDouble();
		
		Scanner op = new Scanner(System.in);
		System.out.println("Enter operation: ");
		operation = op.next();
		
		System.out.println("Enter second value: ");
		x2 = scan.nextDouble();
		
		switch (operation) {
		
			case "+": System.out.println(x1 + x2);
			break;
			
			case "-": System.out.println(x1 - x2);
			break;
			
			case "*": System.out.println(x1 * x2);
			break;
			
			case "/": System.out.println(x1 / x2);
			break;
			
			default: System.out.println("Invalid Operation");
		}
		
		

	}

}
