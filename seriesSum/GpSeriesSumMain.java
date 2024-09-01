package seriesSum;

import java.util.Scanner;

public class GpSeriesSumMain {

	public static void main(String[] args) {
		GpSeriesLogic gpSeries = new GpSeriesLogic();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number :");
		int a = sc.nextInt();
		System.out.print("Enter the coommon ration :");
		int r = sc.nextInt();
		System.out.print("Enter the total term : ");
		int n = sc.nextInt();
		gpSeries.gpSeriesSumLogic(a, r, n);
		

	}

}
