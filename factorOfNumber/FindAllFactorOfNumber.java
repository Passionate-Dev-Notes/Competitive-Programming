package factorOfNumber;

public class FindAllFactorOfNumber {
	public void findFactor(int data) {
		for(int i =1 ; i<=data/2; i++) {
			if(data%i ==0) {
				System.out.print(i+" ");
			}
				
		}
		System.out.print(data+" ");
	
	}

}
