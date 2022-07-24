
public class ReversedWord {

	public static void main(String[] args) 
	{
		
		String input = "Mississippi";
		
		byte [] jumbleLetters = input.getBytes();
		byte [] result = new byte[jumbleLetters.length];
		
		for (int i=0; i < jumbleLetters.length; i++) {
			result[i] = jumbleLetters[jumbleLetters.length - i - 1];
			
		
		}
		System.out.println(new String(result));	

	}

}
