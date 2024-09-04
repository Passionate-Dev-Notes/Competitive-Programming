package automorphicNumber;

import java.util.Scanner;
/*
 * A number is called an Automorphic number if and only if its square ends 
 * in the same digits as the number itself.
 */

public class AutomorphicNumber {

	public static void main(String[] args) {
		AutomorphicNumberLogic autmor = new AutomorphicNumberLogic();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check that is Automorphic NUmber or not");
		int n = sc.nextInt();
		boolean check = autmor.isautomorphicNumber(n);
		if(check)
			System.out.println(n+" Yes, It's Automorphic number");
		else 
			System.out.println(n+" No, It's not Automorphic number");
		

	}

}
