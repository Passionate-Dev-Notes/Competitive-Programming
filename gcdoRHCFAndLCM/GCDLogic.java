package gcdoRHCFAndLCM;

public class GCDLogic {
	public int gcdLogic(int n1, int n2) {
		int size = 0;
	    int temp=0;
		int swap=0;
	    
		if(n1<n2) {
			size =n2;
			//inloop = n1
		}
		else
			size =n1;
		for(int i = 1 ; i<size; i++) {
			if(n1%i == 0) {
				if(n2 % i ==0) {
					temp = i;
				}
			}
		}
	
		if(swap<temp) {
			swap =temp;
		}
		return swap;
	
	}

}
