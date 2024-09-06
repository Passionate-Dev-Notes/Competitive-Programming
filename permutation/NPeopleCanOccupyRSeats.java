package permutation;

import java.util.Scanner;

public class NPeopleCanOccupyRSeats {

	public static void main(String[] args) {
		NPeopleCanSeatOnRSeats arrange = new NPeopleCanSeatOnRSeats();
		Scanner sc = new Scanner(System.in);
		
		char check = 0 ;
		do{
			System.out.println("Enter total number of person that you arrange them into certain order");
			int n = sc.nextInt();
			System.out.println("Total number of seat");
			int r = sc.nextInt();
			int result = arrange.permutationNofR(n, r);
			System.out.println(result);
			System.out.println("Do you want to check more if yes then enter Y");
			String ch = sc.nextLine();
			if(ch.length() == 1)
				check = ch.charAt(0);
			else {
				System.out.println("Ooono, formate is not right");
				continue;
			}
				
		}while(check=='y');
		

	}

}
