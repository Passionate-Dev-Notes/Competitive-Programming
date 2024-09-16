package tcsQuestion;
import java.util.*;

public class LogicToFindOutMinCost {
	public int logicToFindOutMinCost(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		int sum =0;
		for(int i =0;i<n-1;i++) {
			int temp = 0;
			temp = arr[i] +arr[i+1];
			sum = sum +temp;
			arr[i] = temp;
			arr[i+1] = 0;
			Arrays.sort(arr);
		}
		return sum;
	}

}
