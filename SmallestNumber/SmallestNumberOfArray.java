package SmallestNumber;

import java.util.Arrays;

class FindSmallestNumber{
	public int smallest(int[] arr) {
		Arrays.sort(arr);
		int lowest =arr[0];
		int highest =arr[arr.length-1];
	   return arr[0];
	
	}
}
public class SmallestNumberOfArray {

	public static void main(String[] arg) {
		FindSmallestNumber obj = new FindSmallestNumber();
		int[] arr = {2,5,1,7,9,0};
		int result = obj.smallest(arr);
		System.out.println(result);
	}

}
