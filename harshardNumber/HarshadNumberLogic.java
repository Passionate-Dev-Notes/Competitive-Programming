package harshardNumber;

public class HarshadNumberLogic {
	public boolean isHarshadNumber(int data) {
		int duplicateData = data;
		int sum =0;
		while(data>0) {
			int temp = data%10;
			sum = sum+temp;
			data= data/10;
		}
		if(duplicateData%sum==0) {
			return true;
		}
		return false;
	}

}
