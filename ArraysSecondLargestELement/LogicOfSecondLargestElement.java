package ArraysSecondLargestELement;
import java.lang.*;

public class LogicOfSecondLargestElement {
	public void logicOfSecondLargestElement(int[] arr, int sizeOfArray) {
		//1,2,4,5,10,9,11
		int small = Integer.MAX_VALUE;
		int second_small = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		for(int i = 0; i < sizeOfArray; i++) {
			small = Math.min(small, arr[i]);
			largest = Math.max(largest, arr[i]);
		}
		
		for(int i = 0; i<sizeOfArray; i++ ) {
			if(arr[i]<second_small && arr[i] != small) {
				second_small= arr[i];
			}
			if(arr[i] > second_largest && arr[i] != largest) {
				second_largest = arr[i];
			}
		}
		
		System.out.println("Second Smallest Number "+second_small);
		System.out.println("Second Largest Number "+second_largest);
	}
 
}
