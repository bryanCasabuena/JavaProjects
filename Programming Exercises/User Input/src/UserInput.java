import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your name: ");
		String name = scanner.nextLine();
		
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		
		
		System.out.println("Month of Birth (number): ");
		int month = scanner.nextInt();
		
	
		if (month <= 12) {
			switch (month) {
				case 1: System.out.println("Hi " + name +"! " + "You are " + age + "! (January)");
				break;
				case 2: System.out.println("Hi " + name +"! " + "You are " + age + "! (February)");
				break;
				case 3: System.out.println("Hi " + name +"! " + "You are " + age + "! (March)");
				break;
				case 4: System.out.println("Hi " + name +"! " + "You are " + age + "! (April)");
				break;
				case 5: System.out.println("Hi " + name +"! " + "You are " + age + "! (May)");
				break;
				case 6: System.out.println("Hi " + name +"! " + "You are " + age + "! (June)");
				break;
				case 7: System.out.println("Hi " + name +"! " + "You are " + age + "! (July)");
				break;
				case 8: System.out.println("Hi " + name +"! " + "You are " + age + "! (August)");
				break;
				case 9: System.out.println("Hi " + name +"! " + "You are " + age + "! (September)");
				break;
				case 10: System.out.println("Hi " + name +"! " + "You are " + age + "! (Ocotober)");
				break;
				case 11: System.out.println("Hi " + name +"! " + "You are " + age + "! (November)");
				break;
				case 12: System.out.println("Hi " + name +"! " + "You are " + age + "! (December)");
				break;
			}
		}
		else {
			System.out.println("Invalid");
		}

		
		
		
	
	}

}
