package primeNumber;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberInRangeLogic {
	

	public List<Integer> CheckAllPrimeRec(int first, int last) {
		List<Integer> result= new ArrayList<Integer>();
		int index=0;
		
			for(int i = first; i<=last;i++) {
				int j =2;
				boolean check=false;
				if(i== 1) 
					check = false;
				else if(i==2)
					check = true;
				else {
					while(j <= (i/2)) {
						if(i%j == 0) {
							check = false;
							break;
						}
						else
							check = true;
						j++;
					}
				}
				
				if(check) {
					result.add(i);
					
				}
			}
		
		
		return result;
	}
	}


