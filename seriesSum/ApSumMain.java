package seriesSum;

import java.util.Scanner;

public class ApSumMain {

	public static void main(String[] args) {
		ApSumLogicUsingLoop aPsum = new ApSumLogicUsingLoop();
		int a,d, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number - ");
		a = sc.nextInt();
		System.out.println("Enter the common differnce");
		d = sc.nextInt();
		System.out.println("Enter the  total term");
		n = sc.nextInt();
		int result = aPsum.apSum(a, d, n);
		System.out.println(result);
		
	}

}
