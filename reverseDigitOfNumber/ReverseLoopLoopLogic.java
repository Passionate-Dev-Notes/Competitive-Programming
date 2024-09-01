package reverseDigitOfNumber;

public class ReverseLoopLoopLogic {
	public int checkReverseWithLoop(int data) {
		int sum =0;
		while(data>0) {
			int temp = data%10;
			if(sum == 0 && temp==0) {
				data = data/10;
				continue;
				
			}
			else 
				sum = (sum*10)+temp;
			data = data/10;
			
		}
		return sum;
	}

}
