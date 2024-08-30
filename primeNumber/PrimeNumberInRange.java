package primeNumber;

import java.util.Iterator;
import java.util.List;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		PrimeNumberInRangeLogic rPrime = new PrimeNumberInRangeLogic();
		List<Integer> ltr =rPrime.CheckAllPrimeRec(1, 20);
		Iterator it = ltr.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
