package lcmOrLeastCommonMultiple;

public class LCMLogic {
	public int lcmLogic(int n1, int n2) {
		int multipleStor =1;
		for(int i =2; i<n1/2;i++) {
			while(n1%i==0 && n2%i==0) {
					multipleStor = multipleStor*i;
					n1 = n1/i;
					n2 = n2/i;
			}
			
		}
		if(n1!=0 || n2 !=0) {
			multipleStor=multipleStor*n1*n2;
		}
		return multipleStor;

	}

}
