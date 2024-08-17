package pelindrome;

import java.util.Scanner;

class CheckPelindrome{
	public int isPelindrome(int n) {
		int reversedNumber =0;
		int check =n;
		while(n>0) {
			reversedNumber  = reversedNumber*10 +(n%10);
			n=n/10;
			
		}
		if(reversedNumber == check) {
			return reversedNumber;
		}
		return -1;
	}
}
public class PelindromeNumber {

	public static void main(String[] args) {
		CheckPelindrome obj = new CheckPelindrome();
		Scanner sc = new Scanner(System.in);
		char choice ;
		do {
			
			System.out.print("Enter any number to check, that is pelindrome or not :-");
			int number = sc.nextInt();
			int result = obj.isPelindrome(number);
			if(result != -1)
			System.out.println("Enter number is Pelindrome number "+result);
			else 
				System.out.println("Not Pelindrome");
			System.out.println("Do you want to check more number then Enter Y");
			 choice = sc.next().charAt(0);
			 
		}while(choice=='y');
		
		
		
	}

}
