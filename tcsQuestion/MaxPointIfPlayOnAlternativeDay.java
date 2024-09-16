package tcsQuestion;

import java.util.Scanner;

public class MaxPointIfPlayOnAlternativeDay {
	public static void main(String arg[]){
		LogicOfMaxPointPLay obj = new LogicOfMaxPointPLay();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int size = sc.nextInt();
		System.out.println("Enter the "+size+"value of array");
		int arr[] = new int[size];
		for(int i = 0; i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int maxpoint = obj.logicOfMaxPoint(arr);
		System.out.println(maxpoint);
	}

}
