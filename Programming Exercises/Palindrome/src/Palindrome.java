
public class Palindrome {

	public static void main(String[] args) 
	{
		
		String input = "redivider";
		
		byte [] jumbleLetters = input.getBytes(); 
		byte [] output = new byte[jumbleLetters.length]; 
		
		for (int i = 0; i < jumbleLetters.length; i++) {
			output [i] = jumbleLetters[jumbleLetters.length - i - 1];
			
		}
		if (input.equals(new String(output))) {
			System.out.println(input + " " + "is a " + "Palindrome");
		}
		else {
			System.out.println(input + " " + "is not a " + "Palindrome");
		}
		
		
		

	}

}
