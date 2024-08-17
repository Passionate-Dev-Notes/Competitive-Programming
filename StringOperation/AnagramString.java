package StringOperation;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Anagram string : if re-arranging the on String should give any meaning 
 *full word then it will called Anagram */
class AnagramCheck{
	public boolean anagramCheck(String s1, String s2) {
		char ch1[] = s1.toLowerCase().toCharArray();
		char ch2[] = s1.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		return Arrays.equals(ch1, ch2);
	}
}

public class AnagramString {

	public static void main(String[] args) {
		AnagramCheck obj = new AnagramCheck();
		System.out.println("Kidnly give input as String to check that anagram or not");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		boolean decision =obj.anagramCheck(s1, s2);
		System.out.println(decision);
	   
	}

}
