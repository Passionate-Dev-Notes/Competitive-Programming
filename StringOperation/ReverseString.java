package StringOperation;

import java.util.Scanner;

class ReverseStringLogic{
	public String reverseString(String s) {
		int i =0;
		int j = s.length()-1;
		StringBuffer br = new StringBuffer(s);
		while(i < j) {
			char temp;
			temp =br.charAt(i);
			br.setCharAt(i, br.charAt(j));
			br.setCharAt(j, temp); 
			i++;
			j--;
			
		}
		return br.toString();
	}
}

public class ReverseString {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("which string you want to reverse :- ");
		String s = sc.nextLine();
		ReverseStringLogic obj = new ReverseStringLogic();
		String sr = obj.reverseString(s);
		System.out.println("After reverse:");
		System.out.println(sr);
		
		
		/*
		 * char c; do { System.out.println("Enter any string"); String s =
		 * sc.nextLine();
		 * 
		 * 
		 * System.out.println("Do you want to check more then y"); c =
		 * sc.next().charAt(0); }while(c =='y');
		 */
	}

}
