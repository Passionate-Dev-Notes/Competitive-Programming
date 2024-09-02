package primeFactorOfNumber;

public class primeFactorOfNumberLogic {
	public void primeFactorOfNumber(int data) {
		int arr[] = new int[5];
		int index=0;
		for(int i =1 ; i<= Math.sqrt(data); i++) {
			if(data%i == 0) {
				if(i== 1) {
					arr[index]=i;
					index++;
					System.out.print(i+" ");
				}
				else {
					for(int j =2; j<= Math.sqrt(i);j++) {
						if(i%j != 0) {
							arr[index]=i;
							index++;
							System.out.print(j+" ");
						}
					}
				}
			}
		}
	}

}
