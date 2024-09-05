package abundantNumber;

public class AbundantNumberLogic {
	public boolean isAbundant(int data) {
		int sum =0;
		int duplicateData = data;
		int i = data/2;
		int j =1;
		while(i>0) {
		
			if(data%j == 0) {
				sum = sum+j;
			}
			j++;
			i--;
		}
		if(duplicateData < sum)
			return true;
		
		return false;
	}

}
