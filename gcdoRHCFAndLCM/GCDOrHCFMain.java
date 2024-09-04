package gcdoRHCFAndLCM;

import java.util.Scanner;

public class GCDOrHCFMain {

	public static void main(String[] args) {
	   GCDLogic gcd = new GCDLogic();
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter first number ");
	   int first = sc.nextInt();
	   System.out.print("Enter second number ");
	   int second = sc.nextInt();
	   int result = gcd.gcdLogic(first, second);
	   System.out.println("GCD of this two number is "+result);
	

	}

}
