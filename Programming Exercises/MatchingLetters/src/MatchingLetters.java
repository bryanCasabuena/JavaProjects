import java.util.HashMap;

public class MatchingLetters {

	public static void main(String[] args) 
	{
		
		String word1 = "Mississipi";
		String word2 = "Spaghetti";
		
		char [] a = word1.toCharArray();
		char [] b = word2.toCharArray();
		
		HashMap <Character, Integer> hMap = new HashMap<>();
		HashMap <Character, Integer> hMap2 = new HashMap<>();
		
		for (int i = 0; i < a.length; i++) {
			if(!hMap.containsKey(a[i])) {
				hMap.put(a[i], 1);
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (hMap.containsKey(b[i])) {
				hMap2.put(b[i], 1);
				
			}
		}
		System.out.println(hMap2.size());
		
		
		
		
		

	}

}
