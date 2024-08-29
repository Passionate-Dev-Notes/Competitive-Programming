package primeNumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumberLogic pNumber = new PrimeNumberLogic();
		Scanner sc = new Scanner(System.in);
		char choice;
		do {
			System.out.println("Provide the number to proceed further");
			int n = sc.nextInt();
			boolean result =pNumber.isPrime(n);
			if(result) {
				System.out.println("It's a prime number");
			}
			else
				System.out.println("It's not a Prime Number");
			System.out.println("Do you want to check more then enter Y esle N");
			choice = sc.next().toUpperCase().charAt(0);
		}while(choice == 'Y');
		
		
	}

}
