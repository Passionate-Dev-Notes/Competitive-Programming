package primeNumber;

public class PrimeNumberLogic {
 public boolean isPrime(int data) {
	 for(int i =2; i<=data/2;i++) {
		 if(data%i==0) {
			 return false;
		 }
	 }
	 return true;
 }
}
