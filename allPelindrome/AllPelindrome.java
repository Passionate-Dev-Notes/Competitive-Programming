package allPelindrome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class CheckAllPelindrome  {
	public List<Integer> checkPelindrome(int min, int max) {
		int temp =0;
		int sum =0;
		
		List<Integer> arrayList = new ArrayList<Integer>();
		int index=0;
		for(int i = min; i<=max; i++) {
			int check = i;
			while(check>0) {
				temp = check%10;
				sum = sum*10+temp;
				check= check/10;
			}
			if(sum == i) {
				
				arrayList.add(index, sum);;
				index++;
				
			}
			sum=0;
		}
		return  arrayList;
		
	}
}

public class AllPelindrome {

	public static void main(String[] args) {
		char choice;
		CheckAllPelindrome obj = new CheckAllPelindrome();
		Scanner  sc = new Scanner(System.in);
		do{
		System.out.println("Enter the first and last value from where you want to calculate the value: ");
		System.out.print("Enter the First value ");
		int n1 = sc.nextInt();
		System.out.print("Enter the Second value ");
		int n2 = sc.nextInt();
		List<Integer> itr = obj.checkPelindrome(n1, n2);
		
		Iterator it = itr.iterator();
		int pr =10;
		while(it.hasNext()) {
		
			if(pr>0) {
			System.out.print(it.next()+" ");
			pr--;
			}
			else {
				System.out.println();
				pr = 10;
			}
		}
		System.out.println();
		System.out.println("Do want to calculate more then Enter Y");
	    choice = sc.next().toLowerCase().charAt(0);
		}while(choice == 'y');

	}

}
