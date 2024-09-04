package strongNumber;

import java.util.Scanner;

/*
 * Definition of Strong Number.
 * When the sum of factorial of individual digits of a number is equal 
 * to the original number the number is called a strong number. 
 * Strong number is also known as Krishnamurthi number/Peterson Number.
 * 
 */

public class StrongNumberMain {

	public static void main(String[] args) {
		StrongNumberLogic strng = new StrongNumberLogic();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number");
		int n = sc.nextInt();
		boolean bl = strng.isStrongNUmber(n);
		if (bl)
			System.out.println(n + " it's strong number");
		else
			System.out.println("No," + n + " in not strong number");

	}

}
