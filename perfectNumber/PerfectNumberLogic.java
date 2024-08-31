package perfectNumber;

public class PerfectNumberLogic {
	public boolean perfectNumberLogic(int data) {
		int sum =0;
		for(int i = 1; i<= data/2; i++) {
			if(data % i ==0) {
				sum = sum +i;
			}
		}
		if(sum==data)
			return true;
		
		return false;
	}

}
