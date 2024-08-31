package checkNegativeOrPosetive;

import java.util.Scanner;

public class NegativeOrPosetive {

	public static void main(String[] args) {
		NegativeOfPositiveLogic negPos = new NegativeOfPositiveLogic();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check their nature");
		int n = sc.nextInt();
		negPos.isNegativeOrPositive(n);

	}

}
