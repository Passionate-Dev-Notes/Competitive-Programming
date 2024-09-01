package leapYear;

import java.util.Scanner;

public class LeapYearMain {

	public static void main(String[] args) {
		LeapYearLogic lpyear = new LeapYearLogic();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year that you want to check");
		int n = sc.nextInt();
		boolean yes = lpyear.isLeapYear(n);
		if(yes) {
			System.out.println("Yes, It's ");
		}
		else {
			System.out.println("No, It's not");
		}
	}

}
