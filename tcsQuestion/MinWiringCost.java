package tcsQuestion;
import java.util.*;

public class MinWiringCost {
	public static void main(String[] arg) {
		LogicToFindOutMinCost obj = new LogicToFindOutMinCost();
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
	    System.out.println("enter value");
		for(int j =0; j <6 ; j++) {
			arr[j] = sc.nextInt();
		}
		int result = obj.logicToFindOutMinCost(arr);
		System.out.println(result);
	}

}
