package fabonacciSeries;

import java.util.Scanner;

public class FabonacciSeriesUsingRecursionMain {

	public static void main(String[] args) {
		FabonacciSeriesRec fabRec = new FabonacciSeriesRec();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for calculate Fabonacci series upto that number");
		int n = sc.nextInt();
		System.out.println(fabRec.fabonacciSeriesUsingRec(n));
	}

}
