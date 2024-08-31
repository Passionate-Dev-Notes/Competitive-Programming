package perfectNumber;

import java.util.Scanner;

public class PerfectNumberMain {

	public static void main(String[] args) {
		PerfectNumberLogic prfct = new PerfectNumberLogic();
		Scanner sc = new Scanner(System.in);
		System.out.println("If you want to check your number that is perfect number or not");
		int var = sc.nextInt();
		boolean result = prfct.perfectNumberLogic(var);
		if(result)
			System.out.println("Yes it perfect number "+var);
		else
			System.out.println("It's not perfect number "+var);

	}

}
