package abundantNumber;

import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) {
		AbundantNumberLogic abdant = new AbundantNumberLogic();
		Scanner sc = new Scanner(System.in);
		char ch ;
		do {
			System.out.print("Enter any number ");
			
			int n = sc.nextInt();
			System.out.println();
			boolean result = abdant.isAbundant(n);
			if(result)
				System.out.println("Yes, It's");
			else
				System.out.println("NO, It's not");
			System.out.print("Do you want to check more, If yes then enter y ");
			ch=sc.next().toUpperCase().charAt(0);
		}while(ch == 'Y');
		
	}

}
