package minAndMaxDigitFromNumber;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindMinAndMaximumDigitFromNumber {

	public static void main(String[] args) {
		FindOutMinAndMaxDigit minMax = new FindOutMinAndMaxDigit();
		ArrayList<Integer> lt = minMax.findoutMaxAndMin(8489324);
		int n = lt.size();
		System.out.println(lt.get(n-1));
		System.out.println(lt.get(0));
		System.out.println("Break");
	
		Iterator it =  lt.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
			}

}
