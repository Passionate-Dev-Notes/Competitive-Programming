package pelindrome;

import java.util.Scanner;
class CheckString{
	public boolean stringPelindrome(String s) {
		int i= 0,count = 0;
		int j= s.length()-1;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			j--;
			i++;
		}
	return true;
	}
}

public class PelindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		do {
			System.out.println("Enter any string");
			String s = sc.nextLine();
			CheckString obj = new CheckString();
			boolean result = obj.stringPelindrome(s);
			System.out.println(result);
			System.out.println("Do you want to check more then y");
			c = sc.next().charAt(0);
		}while(c =='y');
		
	
		
	}

}
