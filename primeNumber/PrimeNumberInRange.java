package primeNumber;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		PrimeNumberInRangeLogic rPrime = new PrimeNumberInRangeLogic();
		int result[]=rPrime.CheckAllPrimeRec(5, 20);
		for(int a: result) {
			System.out.print(a+" ");
		}

	}

}
