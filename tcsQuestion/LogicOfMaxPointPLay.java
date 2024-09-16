package tcsQuestion;

public class LogicOfMaxPointPLay {
	public int logicOfMaxPoint(int[] arr) {
		int sum =0, sum1=0;
		for(int i = 0 ; i<arr.length; i+=2) {
			sum += arr[i];
		}
		
		for(int i = 1;i<arr.length-1; i+=2) {
			sum1 += arr[i];
		}
		if(sum>sum1)
			return sum;
		
		return sum1;
	}

}
