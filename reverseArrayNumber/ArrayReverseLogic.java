package reverseArrayNumber;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverseLogic {
	
	public void arrayReverseLogicUsingLibrary(Integer[] arr) {
		Collections.reverse(Arrays.asList(arr));
         for(int a : arr) {
        	 System.out.print(a+" loop1 " );
         }
	}
	
	public void arrayReverseUsingLoop(int[] arr) {
		int[] arr1= new int[arr.length];
		int index=0;
		System.out.println();
		for(int i =arr.length-1; i >=0;i--) {
			arr1[index ] = arr[i];
			index++;
		}
		for(int pr : arr1) {
			System.out.println(pr);
		}
	}
	
	public void reverseUsingRecursion(int[] arr, int start, int last) {
		if(start<last) {
			int temp = arr[last];
			arr[last] = arr[start];
			arr[start] = temp;
			reverseUsingRecursion(arr, start+1, last-1);
		}
		else {
			for(int a: arr) {
				System.out.println(a);
			}
		}
	}

}
