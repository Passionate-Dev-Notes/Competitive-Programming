package factorialUsingRecursion;

import java.util.Scanner;

class FactorialUsingRecursion{
	public static int recursionMethod(int n) {
		if(n==1) {
			return n;
		}
		else
			return (n*recursionMethod(n-1));
	}
	
}

public class Factorial {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number for that you wanr to calculate Factorial");
		int n = sc.nextInt();
		int recursion=FactorialUsingRecursion.recursionMethod(n);
		System.out.println("Factorial of N: "+recursion);
		
		
	}

}
