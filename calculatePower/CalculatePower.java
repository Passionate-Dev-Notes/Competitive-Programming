package calculatePower;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		CalculatePowerLogic cpow = new CalculatePowerLogic();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number -");
		int n = sc.nextInt();
		System.out.print("Enter the power -");
		int p = sc.nextInt();
		int result = cpow.calculatePowerLogic(n, p);
		System.out.println(result);
	}

}
