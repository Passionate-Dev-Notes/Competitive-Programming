package StringOperation;
import java.util.HashMap;
import java.util.Scanner;
class RemoveDuplicate{
	public String removeDuplicate(char s[],int n) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		String result ="";
		for(int i =0; i<n;i++) {
			if(!hm.containsKey(s[i])) {
				result += s[i];
				hm.put(s[i], 1);
			}
		}
		return result;
	}
}
public class RemoveDuplicateChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String that duplicate Char");
		String sr = sc.nextLine();
		char ch[] = sr.toCharArray();
		int n = sr.length();
		RemoveDuplicate obj = new RemoveDuplicate();
		String result =obj.removeDuplicate(ch, n);
		System.out.println(result);
		
		

	}

}
