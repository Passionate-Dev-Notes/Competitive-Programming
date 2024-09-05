package lcmOrLeastCommonMultiple;

import java.util.Scanner;

public class LCMOrLeastCommonMultiple {

	public static void main(String[] args) {
		LCMLogic lcm = new LCMLogic();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		
		int result = lcm.lcmLogic(n1, n2);
		System.out.println("Lcm of two Number is: "+result);

	}

}
