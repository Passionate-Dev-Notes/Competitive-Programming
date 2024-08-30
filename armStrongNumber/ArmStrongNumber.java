package armStrongNumber;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		ArmStrongNumberLogic arms = new ArmStrongNumberLogic();
		 ArmStrongNumberUsingSimpleLogic obj = new  ArmStrongNumberUsingSimpleLogic();
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number to check ");
		
		
		int n = sc.nextInt();
		System.out.println();
		int result =obj.checkArmstrongNumber(n);
		if(result>0)
			System.out.println("Yes " + result);
		else
			System.out.println("No");
		int ret = arms.checkArmstrongNumber(153);
		if(n == ret) {
			System.out.print("Yes, It's Armstrong number"+ ret);
			System.out.println();

		}
		else {
			System.out.println("It's not Armstrong number");
		}
		
	}

}
