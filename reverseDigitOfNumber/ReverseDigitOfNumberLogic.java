package reverseDigitOfNumber;

public class ReverseDigitOfNumberLogic {
	public int reverseNumber(int data) {
		int len = String.valueOf(data).length();
		String sum ="";
		int n = sum.length();
		for(int i =0; i<len; i++) {
			int temp = data%10;
			data = data/10;
			if(sum.isEmpty() && temp ==0 )
				continue;
			else
				sum += temp;
			
		}
		int reSum = Integer.parseInt(sum);
		return reSum;
	}

}
