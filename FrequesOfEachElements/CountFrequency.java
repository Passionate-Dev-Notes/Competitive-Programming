package FrequesOfEachElements;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
	public void countfrequency(int[] ar) {
		int n = ar.length;
		int temp=1;
	    HashMap<Integer, Integer> count = new HashMap<Integer, Integer>(n);
		for(int i =0; i<n; i++) {
			if(count.containsKey(ar[i])) {
			  count.put(ar[i],count.get(ar[i])+1);
			}
			else
				count.put(ar[i],1);
			
		}
		for(Map.Entry<Integer, Integer> entity : count.entrySet()) {
			System.out.println(entity.getKey()+" "+entity.getValue());
		}
	}

}




class ArrayFrequancyCount{
	public void arrayFrequancyCount(int[] arr) {
		int n = arr.length;
		boolean[] check = new boolean[n];
		//{2,3,4,5,2,3,4,5,6};
		for(int i =0;i<n;i++) {
			if(check[i]== true)
				continue;
			
			int count =1;
			for(int j= i+1; j<n;j++) {
				if(arr[i] == arr[j]){
					check[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] +" count frequency "+count);
		}
	}
}
