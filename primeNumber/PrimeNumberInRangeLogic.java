package primeNumber;


public class PrimeNumberInRangeLogic {
	

	public int[] CheckAllPrimeRec(int first, int last) {
		int result[]= new int[(first+last)/2];
		int index=0;
		
			for(int i = first; i<=last;i++) {
				int j =2;
				boolean check=false;
				//i=(int)Math.sqrt(i);
				while(j <= (i/2)) {
					if(i%j == 0) {
						check = false;
						break;
					}
					else
						check = true;
					j++;
				}
				if(check) {
					result[index] = i;
					index++;
				}
			}
		
		
		return result;
	}
	}


